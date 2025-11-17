package swing;

import mvc.v1.BoundedInteger;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Cours9GUI extends JFrame {

    private final BoundedInteger model;

    private final JButton btnDec = new JButton("Decrement");
    private final JButton btnInc = new JButton("Increment");
    private final JTextField tfLower = new JTextField(3);
    private final JTextField tfCurrent = new JTextField(3);
    private final JTextField tfUpper = new JTextField(3);
    private final JSlider slider;

    private boolean updating = false;

    public Cours9GUI(BoundedInteger model) {
        super("BoundedInteger Demo");
        this.model = model;

        // Base layout
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Menus
        setJMenuBar(buildMenuBar());

        // Top row: [Decrement]  [lower]  <  [current]  <  [upper]  [Increment]
        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 8));
        top.add(btnDec);
        top.add(tfLower);
        top.add(new JLabel("<"));
        top.add(tfCurrent);
        top.add(new JLabel("<"));
        top.add(tfUpper);
        top.add(btnInc);
        add(top, BorderLayout.NORTH);

        // Slider row
        slider = new JSlider(model.getLowerBound(), model.getUpperBound(), model.getCurrentValue());
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(1);
        slider.setLabelTable(slider.createStandardLabels(1));
        JPanel center = new JPanel(new BorderLayout());
        center.setBorder(BorderFactory.createEmptyBorder(8, 16, 16, 16));
        center.add(slider, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        // Wire UI -> model
        btnDec.addActionListener(e -> model.decrement());
        btnInc.addActionListener(e -> model.increment());
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (updating) return;
                if (!slider.getValueIsAdjusting()) {
                    model.setValue(slider.getValue());
                }
            }
        });
        installApplyOnActionOrFocus(tfLower, this::applyLower);
        installApplyOnActionOrFocus(tfCurrent, this::applyCurrent);
        installApplyOnActionOrFocus(tfUpper, this::applyUpper);

        // Wire model -> UI (bound properties)
        model.addPropertyChangeListener(BoundedInteger.PROP_CURRENT_VALUE, new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                syncCurrentFromModel();
            }
        });
        model.addPropertyChangeListener(BoundedInteger.PROP_LOWER_BOUND, new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                syncLowerFromModel();
            }
        });
        model.addPropertyChangeListener(BoundedInteger.PROP_UPPER_BOUND, new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                syncUpperFromModel();
            }
        });

        // Initial sync
        syncAllFromModel();

        pack();
        setLocationByPlatform(true);
        setMinimumSize(getSize());
    }

    private JMenuBar buildMenuBar() {
        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> System.exit(0));
        file.add(exit);
        JMenu actions = new JMenu("Actions"); // placeholder to match screenshot
        bar.add(file);
        bar.add(actions);
        return bar;
    }

    // Apply methods (UI -> model)
    private void applyLower() {
        Integer v = parseInt(tfLower.getText());
        if (v == null) { revertLower(); return; }
        model.setLowerBound(v);
    }

    private void applyCurrent() {
        Integer v = parseInt(tfCurrent.getText());
        if (v == null) { revertCurrent(); return; }
        model.setValue(v);
    }

    private void applyUpper() {
        Integer v = parseInt(tfUpper.getText());
        if (v == null) { revertUpper(); return; }
        model.setUpperBound(v);
    }

    private void installApplyOnActionOrFocus(JTextField field, Runnable apply) {
        field.addActionListener(e -> apply.run());
        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                apply.run();
            }
        });
    }

    // Model -> UI sync helpers
    private void syncAllFromModel() {
        updating = true;
        try {
            tfLower.setText(String.valueOf(model.getLowerBound()));
            tfCurrent.setText(String.valueOf(model.getCurrentValue()));
            tfUpper.setText(String.valueOf(model.getUpperBound()));
            slider.setMinimum(model.getLowerBound());
            slider.setMaximum(model.getUpperBound());
            slider.setValue(model.getCurrentValue());
            slider.setLabelTable(slider.createStandardLabels(1));
            updateButtons();
        } finally {
            updating = false;
        }
    }

    private void syncCurrentFromModel() {
        updating = true;
        try {
            tfCurrent.setText(String.valueOf(model.getCurrentValue()));
            slider.setValue(model.getCurrentValue());
            updateButtons();
        } finally {
            updating = false;
        }
    }

    private void syncLowerFromModel() {
        updating = true;
        try {
            tfLower.setText(String.valueOf(model.getLowerBound()));
            slider.setMinimum(model.getLowerBound());
            slider.setLabelTable(slider.createStandardLabels(1));
            if (slider.getValue() < slider.getMinimum()) {
                slider.setValue(slider.getMinimum());
            }
            updateButtons();
        } finally {
            updating = false;
        }
    }

    private void syncUpperFromModel() {
        updating = true;
        try {
            tfUpper.setText(String.valueOf(model.getUpperBound()));
            slider.setMaximum(model.getUpperBound());
            slider.setLabelTable(slider.createStandardLabels(1));
            if (slider.getValue() > slider.getMaximum()) {
                slider.setValue(slider.getMaximum());
            }
            updateButtons();
        } finally {
            updating = false;
        }
    }

    private void updateButtons() {
        btnDec.setEnabled(model.getCurrentValue() > model.getLowerBound());
        btnInc.setEnabled(model.getCurrentValue() < model.getUpperBound());
    }

    // Revert helpers on parse error
    private void revertLower() { tfLower.setText(String.valueOf(model.getLowerBound())); beep(); }
    private void revertCurrent() { tfCurrent.setText(String.valueOf(model.getCurrentValue())); beep(); }
    private void revertUpper() { tfUpper.setText(String.valueOf(model.getUpperBound())); beep(); }

    private void beep() { Toolkit.getDefaultToolkit().beep(); }

    private Integer parseInt(String s) {
        try { return Integer.valueOf(s.trim()); }
        catch (Exception ex) { return null; }
    }
}
