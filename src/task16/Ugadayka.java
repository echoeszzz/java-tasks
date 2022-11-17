package task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ugadaika extends JFrame {
    JTextField jta = new JTextField(10);
    Font font = new Font("SanSerif", Font.BOLD, 20);

    JButton confirm = new JButton("Confirm");
    int tryCount = 3;

    Ugadaika() {
        super("Game");
        setLayout(new FlowLayout());
        setSize(300, 300);
        setLocationRelativeTo(null);

        add(jta);
        jta.setFont(font);

        add(confirm);
        confirm.setFont(font);

        int goal = (int) (Math.random() * 20);

        confirm.addActionListener(e -> {
            int enteredNum = Integer.parseInt(jta.getText().trim());
            tryCount--;
            if (tryCount >= 0) {
                if (enteredNum != goal) {
                    if (enteredNum > goal) {
                        JOptionPane.showMessageDialog(null,
                                "Загаданное число меньше " + "\n" + "Осталось попыток: "
                                        + tryCount + " ", "Info",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Загаданное число больше " + "\n" + "Осталось попыток: "
                                        + tryCount + " ", "Info",
                                JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Вы угадали число!", "Win",
                            JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new Ugadaika();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Число было: " + goal, "Game over",
                        JOptionPane.INFORMATION_MESSAGE);
                dispose();
                new Ugadaika();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ugadaika();
    }

}
