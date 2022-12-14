package task22;

import javax.swing.*;
import java.awt.*;

public class GUI_RPN {
    private JFrame window;

    public GUI_RPN() {
        window = new JFrame("Calc");
        window.setSize(260, 350);
        window.add(new PanelRPN());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI_RPN::new);
    }
}
