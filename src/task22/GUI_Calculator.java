package task22;

import javax.swing.*;

public class GUI_Calculator {
    private JFrame window;

    public GUI_Calculator() {
        window = new JFrame("Calc");
        window.setSize(260, 350);
        window.add(new PanelCalculator());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI_Calculator::new);
    }
}
