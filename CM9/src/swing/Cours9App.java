package swing;

import mvc.v1.BoundedInteger;

import javax.swing.*;
public class Cours9App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Defaults to match the screenshot: lower 0, current 1, upper 10
            BoundedInteger model = new BoundedInteger(1, 0, 10);
            new Cours9GUI(model).setVisible(true);
        });
    }
}
