package task22;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class PanelCalculator extends JPanel {
    double result = 0;
    String previousComm = "";

    public String removeLastChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(0, s.length() - 1);
    }

    public String removeFirstChar(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        return s.substring(1);
    }

    private JButton numbers[] = new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD, 17);
    private JTextField output = new JTextField();
    private JButton backspace = new JButton("<-");
    private JButton equels = new JButton("=");

    private JButton plus = new JButton("+");

    private JButton minus = new JButton("-");

    private JButton multiply = new JButton("*");

    private JButton division = new JButton("/");

    public PanelCalculator() {

        setLayout(null);

        backspace.setBounds(10, 250, 50, 50);
        backspace.setFont(font);
        add(backspace);

        equels.setBounds(130, 250, 50, 50);
        equels.setFont(font);
        add(equels);

        minus.setBounds(190, 70, 50, 50);
        minus.setFont(font);
        add(minus);

        plus.setBounds(190, 130, 50, 50);
        plus.setFont(font);
        add(plus);

        division.setBounds(190, 190, 50, 50);
        division.setFont(font);
        add(division);

        multiply.setBounds(190, 250, 50, 50);
        multiply.setFont(font);
        add(multiply);

        numbers[0] = new JButton((0) + "");
        numbers[0].setBounds(70, 250, 50, 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[j * 3 + i + 1] = new JButton((j * 3 + i + 1) + "");
                numbers[j * 3 + i + 1].setBounds(i * (50 + 10) + 10, j * (50 + 10) + 70,
                        50, 50);
                numbers[j * 3 + i + 1].setFont(font);
                add(numbers[j * 3 + i + 1]);
            }
        }

        output.setBounds(10, 10, 230, 50);
        output.setEditable(false);//???? ?????????? ???????? ????????????????, ?????? ?????? ????????????????
        output.setFont(font);
        add(output);

        ActionListener pushNumb = (ActionEvent e) -> {
            JButton b =
                    (JButton) e.getSource();//???????????????? ????????????, ?????????????? ?????????????? ??????. ?????? ???????????? ?????????? ???????????? ?? ?????? ??????????
            // ???????????????????? ???????? ???? ????????????, ?????????????? ?????????? ?? ?????????????? numbers
            output.setText(output.getText()
                    + b.getText());//output.getText() - ?????? ??????????, ?????????????? ???? ???????????? ??????????, b.getText() - ???????????????? ????????????.
        };

        ActionListener deleteNumb = (ActionEvent e) -> {
            String temp = output.getText();
            temp = removeLastChar(temp);
            output.setText(temp);
        };

        ActionListener equ = (ActionEvent e) -> {
            if (Objects.equals(previousComm, "+")) {
                String temp = output.getText();
                char[] tempC = temp.toCharArray();
                if (tempC[0] == '+') {
                    for (int i = 0; i < 2; i++) {
                        temp = removeFirstChar(temp);
                    }
                }
                double Numb = Double.parseDouble(temp);
                result += Numb;
            }

            if (Objects.equals(previousComm, "-")) {
                String temp = output.getText();
                char[] tempC = temp.toCharArray();
                if (tempC[0] == '-') {
                    for (int i = 0; i < 2; i++) {
                        temp = removeFirstChar(temp);
                    }
                }
                double Numb = Double.parseDouble(temp);
                result += Numb * (-1);
            }

            if (Objects.equals(previousComm, "*")) {
                String temp = output.getText();
                char[] tempC = temp.toCharArray();
                if (tempC[0] == '*') {
                    for (int i = 0; i < 2; i++) {
                        temp = removeFirstChar(temp);
                    }
                }
                double Numb = Double.parseDouble(temp);
                result *= Numb;
            }

            if (Objects.equals(previousComm, "/")) {
                String temp = output.getText();
                char[] tempC = temp.toCharArray();
                if (tempC[0] == '/') {
                    for (int i = 0; i < 2; i++) {
                        temp = removeFirstChar(temp);
                    }
                }
                double Numb = Double.parseDouble(temp);
                result /= Numb;
            }
            String temp = Double.toString(result);
            output.setText(temp);
            result = 0;
            previousComm = "";
        };
        ActionListener plusNumbers = (ActionEvent e) -> {
            previousComm = "+";
            String temp = output.getText();
            char[] tempC = temp.toCharArray();
            if (temp != "" && tempC[0] != '+') {
                double Numb = Double.parseDouble(
                        temp);//???????????????????????????? ???????????? ?? ??????????(???????????????????? ???????????? ??????????)
                result += Numb;
                output.setText("+ ");
            } else if (tempC[0] == '+') {
                for (int i = 0; i < 2; i++) {
                    temp = removeFirstChar(temp);
                }
                double Numb = Double.parseDouble(temp);
                result += Numb;
                output.setText("+ ");
            }
        };
        ActionListener minusNumbers = (ActionEvent e) -> {
            previousComm = "-";
            String temp = output.getText();
            char[] tempC = temp.toCharArray();
            if (!temp.equals("") && tempC[0] != '-') {
                double Numb = Double.parseDouble(
                        temp);//???????????????????????????? ???????????? ?? ??????????(???????????????????? ???????????? ??????????)
                result += Numb;
                output.setText("- ");
            } else {
                for (int i = 0; i < 2; i++) {
                    temp = removeFirstChar(temp);
                }
                double Numb = Double.parseDouble(temp);
                result += Numb * (-1);
                output.setText("- ");
            }
        };
        ActionListener multiplyNumbers = (ActionEvent e) -> {
            previousComm = "*";
            String temp = output.getText();
            char[] tempC = temp.toCharArray();
            if (!temp.equals("") && tempC[0] != '*') {
                double Numb = Double.parseDouble(
                        temp);//???????????????????????????? ???????????? ?? ??????????(???????????????????? ???????????? ??????????)
                result += Numb;
                output.setText("* ");
            } else {
                for (int i = 0; i < 2; i++) {
                    temp = removeFirstChar(temp);
                }
                double Numb = Double.parseDouble(temp);
                result *= Numb;
                output.setText("* ");
            }
        };
        ActionListener divisionNumbers = (ActionEvent e) -> {
            previousComm = "/";
            String temp = output.getText();
            char[] tempC = temp.toCharArray();
            if (!Objects.equals(temp, "") && tempC[0] != '/') {
                double Numb = Double.parseDouble(
                        temp);//???????????????????????????? ???????????? ?? ??????????(???????????????????? ???????????? ??????????)
                result += Numb;
                output.setText("/ ");
            } else if (tempC[0] == '/') {
                for (int i = 0; i < 2; i++) {
                    temp = removeFirstChar(temp);
                }
                double Numb = Double.parseDouble(temp);
                result /= Numb;
                output.setText("/ ");
            }
        };
        equels.addActionListener(equ);
        plus.addActionListener(plusNumbers);
        minus.addActionListener(minusNumbers);
        multiply.addActionListener(multiplyNumbers);
        division.addActionListener(divisionNumbers);
        backspace.addActionListener(deleteNumb);
        for (JButton b : numbers) {
            b.addActionListener(pushNumb);
        }
    }

}
