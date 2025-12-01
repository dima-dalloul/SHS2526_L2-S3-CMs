package swing;

import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing {
    /**
     * Create the GUI and show it. For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        //Create the menu bar.
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenuItem menuItemExit = new JMenuItem("Exit");
        menuItemExit.addActionListener(e -> System.exit(0));
        menuFile.add(menuItemExit);
        menuBar.add(menuFile);
        JMenu menuActions = new JMenu("Actions");
        JMenuItem menuItemDoSomething = new JMenuItem("Do Something");
        menuItemDoSomething.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Doing something!"));
        menuActions.add(menuItemDoSomething);
        menuBar.add(menuActions);
        frame.setJMenuBar(menuBar);

        // Create the main content panel
        BorderLayout layout = new BorderLayout();
        JPanel mainPanel = new JPanel(layout);
        mainPanel.add(label, BorderLayout.CENTER);
        frame.getContentPane().add(mainPanel);


        //Display the window.
        frame.setSize(800, 600);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}