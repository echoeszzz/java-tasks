package task15;

import javax.swing.*;
import java.awt.event.*;


public class CalculatorApp implements ActionListener {
    JFrame f;
    JTextField t;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonDivide,
            buttonMultiple, buttonSubtract, buttonAdd, buttonDecimal, buttonEq, buttonDelete, buttonClear;
    static double a = 0;
    static double b = 0;

    private enum Operator {
        EMPTY,
        ADD,
        SUBTRACT,
        MULTIPLE,
        DIVIDE
    }

    static Operator operator = Operator.EMPTY;

    CalculatorApp() {
        f = new JFrame("Calculator");
        t = new JTextField();
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonDivide = new JButton("/");
        buttonMultiple = new JButton("*");
        buttonSubtract = new JButton("-");
        buttonAdd = new JButton("+");
        buttonDecimal = new JButton(".");
        buttonEq = new JButton("=");
        buttonDelete = new JButton("Delete");
        buttonClear = new JButton("Clear");

        t.setBounds(30, 40, 280, 30);
        button7.setBounds(40, 100, 50, 40);
        button8.setBounds(110, 100, 50, 40);
        button9.setBounds(180, 100, 50, 40);
        buttonDivide.setBounds(250, 100, 50, 40);

        button4.setBounds(40, 170, 50, 40);
        button5.setBounds(110, 170, 50, 40);
        button6.setBounds(180, 170, 50, 40);
        buttonMultiple.setBounds(250, 170, 50, 40);

        button1.setBounds(40, 240, 50, 40);
        button2.setBounds(110, 240, 50, 40);
        button3.setBounds(180, 240, 50, 40);
        buttonSubtract.setBounds(250, 240, 50, 40);

        buttonDecimal.setBounds(40, 310, 50, 40);
        button0.setBounds(110, 310, 50, 40);
        buttonEq.setBounds(180, 310, 50, 40);
        buttonAdd.setBounds(250, 310, 50, 40);

        buttonDelete.setBounds(60, 380, 100, 40);
        buttonClear.setBounds(180, 380, 100, 40);

        f.add(t);
        f.add(button7);
        f.add(button8);
        f.add(button9);
        f.add(buttonDivide);
        f.add(button4);
        f.add(button5);
        f.add(button6);
        f.add(buttonMultiple);
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.add(buttonSubtract);
        f.add(buttonDecimal);
        f.add(button0);
        f.add(buttonEq);
        f.add(buttonAdd);
        f.add(buttonDelete);
        f.add(buttonClear);

        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiple.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonDecimal.addActionListener(this);
        buttonEq.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonClear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            t.setText(t.getText().concat("1"));
        }
        if (e.getSource() == button2) {
            t.setText(t.getText().concat("2"));
        }
        if (e.getSource() == button3) {
            t.setText(t.getText().concat("3"));
        }
        if (e.getSource() == button4) {
            t.setText(t.getText().concat("4"));
        }
        if (e.getSource() == button5) {
            t.setText(t.getText().concat("5"));
        }
        if (e.getSource() == button6) {
            t.setText(t.getText().concat("6"));
        }
        if (e.getSource() == button7) {
            t.setText(t.getText().concat("7"));
        }
        if (e.getSource() == button8) {
            t.setText(t.getText().concat("8"));
        }
        if (e.getSource() == button9) {
            t.setText(t.getText().concat("9"));
        }
        if (e.getSource() == button0) {
            t.setText(t.getText().concat("0"));
        }
        if (e.getSource() == buttonDecimal) {
            t.setText(t.getText().concat("."));
        }
        if (e.getSource() == buttonAdd) {
            a = Double.parseDouble(t.getText());
            operator = Operator.ADD;
            t.setText("");
        }
        if (e.getSource() == buttonSubtract) {
            a = Double.parseDouble(t.getText());
            operator = Operator.SUBTRACT;
            t.setText("");
        }
        if (e.getSource() == buttonMultiple) {
            a = Double.parseDouble(t.getText());
            operator = Operator.MULTIPLE;
            t.setText("");
        }
        if (e.getSource() == buttonDivide) {
            a = Double.parseDouble(t.getText());
            operator = Operator.DIVIDE;
            t.setText("");
        }
        if (e.getSource() == buttonEq) {
            b = Double.parseDouble(t.getText());
            switch (operator) {
                case ADD -> a = a + b;
                case SUBTRACT -> a = a - b;
                case MULTIPLE -> a = a * b;
                case DIVIDE -> a = a / b;
                default -> a = 0;
            }
            t.setText("" + a);
        }
        if (e.getSource() == buttonClear) {
            t.setText("");
        }
        if (e.getSource() == buttonDelete) {
            String s = t.getText();
            t.setText("");
            for (int i = 0; i < s.length() - 1; i++) {
                t.setText(t.getText() + s.charAt(i));
            }
        }
    }

    public static void main(String... s) {
        new CalculatorApp();
    }
}
