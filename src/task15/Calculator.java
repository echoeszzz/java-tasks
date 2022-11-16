package task15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator implements ActionListener {
    private final JTextField jta1 = new JTextField(10);
    private final JTextField jta2 = new JTextField(10);
    private final JButton button1 = new JButton("Add them up");
    private final JButton button2 = new JButton("Subtract them up");
    private final JButton button3 = new JButton("Multiple them up");
    private final JButton button4 = new JButton("Divide them up");
    private final JTextField jtf = new JTextField();

    public Calculator() {
        var frame = new JFrame("Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(180, 240);
        jtf.setBounds(20, 170, 130, 20);


        jta1.setBounds(20, 10, 50, 20);
        jta2.setBounds(100, 10, 50, 20);
        button1.setBounds(20, 50, 130, 20);
        button2.setBounds(20, 80, 130, 20);
        button3.setBounds(20, 110, 130, 20);
        button4.setBounds(20, 140, 130, 20);

        frame.add(jta1);
        frame.add(jta2);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(jtf);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jtf.setText("");
        Double result = null;
        if (e.getSource() == button1) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                result = x1 + x2;
                //jtf.setText("Result = " + (x1 + x2));

            } catch (Exception exception) {
                //JOptionPane.showMessageDialog(null, "Error in Numbers !", " alert ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == button2) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                result = x1 - x2;

            } catch (Exception exception) {
                //JOptionPane.showMessageDialog(null, "Error in Numbers !", " alert ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == button3) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                result = x1 * x2;

            } catch (Exception exception) {
                //JOptionPane.showMessageDialog(null, "Error in Numbers !", " alert ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == button4) {
            try {
                double x1 = Double.parseDouble(jta1.getText().trim());
                double x2 = Double.parseDouble(jta2.getText().trim());
                result = x1 / x2;
            } catch (Exception exception) {
                //JOptionPane.showMessageDialog(null, "Error in Numbers !", " alert ", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (result != null) {
            jtf.setText("" + result);
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
