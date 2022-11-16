package task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ColorApp implements ActionListener {
    private final JTextArea jta = new JTextArea();
    private final String[] comboItems1 = new String[]{"Blue", "Red", "Black"};
    private final String[] comboItems2 =
            new String[]{"Times New Roman", "MS Sans Serif", "Courier New"};
    private final JComboBox<String> comboColor = new JComboBox<>(comboItems1);
    private final JComboBox<String> comboFont = new JComboBox<>(comboItems2);

    public ColorApp() {
        var frame = new JFrame("ColorApp");
        frame.setSize(200, 130);
        jta.setBounds(10, 10, 180, 20);
        comboColor.setBounds(10, 40, 180, 20);
        comboFont.setBounds(10, 70, 180, 20);
        /*jta.setFont(fonts[2]);
        jta.setForeground(Color.BLUE);*/
        frame.add(jta);
        frame.add(comboColor);
        frame.add(comboFont);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        comboColor.addActionListener(this);
        comboFont.addActionListener(this);
    }

    public static void main(String[] args) {
        new ColorApp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboColor) {
            var newFontColor = (String) comboColor.getSelectedItem();
            System.out.println(newFontColor);
            switch (Objects.requireNonNull(newFontColor)) {
                case "Black" -> jta.setForeground(Color.BLACK);
                case "Red" -> jta.setForeground(Color.RED);
                case "Blue" -> jta.setForeground(Color.BLUE);
            }
            System.out.println("newColor");
        }
        if (e.getSource() == comboFont) {

            var newFont = (String) comboFont.getSelectedItem();
            jta.setFont(new Font(newFont, Font.BOLD, 14));
            System.out.println("newFont");
        }
    }

}
