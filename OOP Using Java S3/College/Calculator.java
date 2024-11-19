import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton, eightButton, nineButton, divisionButton, fourButton, fiveButton, sixButton, mulButton,
            oneButton, twoButton, threeButton, minusButton, dotButton, zeroButton, equalButton, addButton, clearButton;

    String operator = "";
    double firstOperand = 0, secondOperand = 0;

    public Calculator() {
        jf = new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLabel = new JLabel();
        displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);

        // Initialize buttons and add ActionListeners
       
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        jf.add(nineButton);
        nineButton.addActionListener(this);

        divisionButton = new JButton("/");
        divisionButton.setBounds(330, 130, 80, 80);
        jf.add(divisionButton);
        divisionButton.addActionListener(this);

        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        jf.add(sixButton);
        sixButton.addActionListener(this);

        mulButton = new JButton("x");
        mulButton.setBounds(330, 230, 80, 80);
        jf.add(mulButton);
        mulButton.addActionListener(this);

        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        jf.add(threeButton);
        threeButton.addActionListener(this);

        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        jf.add(minusButton);
        minusButton.addActionListener(this);

        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        jf.add(dotButton);
        dotButton.addActionListener(this);

        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        jf.add(equalButton);
        equalButton.addActionListener(this);

        addButton = new JButton("+");
        addButton.setBounds(330, 430, 80, 80);
        jf.add(addButton);
        addButton.addActionListener(this);

        clearButton = new JButton("CLR");
        clearButton.setBounds(430, 430, 80, 80);
        jf.add(clearButton);
        clearButton.addActionListener(this);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String currentText = displayLabel.getText();
        
        // Number and dot buttons
        if (e.getSource() == sevenButton) {
            displayLabel.setText(currentText + "7");
        } else if (e.getSource() == eightButton) {
            displayLabel.setText(currentText + "8");
        } else if (e.getSource() == nineButton) {
            displayLabel.setText(currentText + "9");
        } else if (e.getSource() == fourButton) {
            displayLabel.setText(currentText + "4");
        } else if (e.getSource() == fiveButton) {
            displayLabel.setText(currentText + "5");
        } else if (e.getSource() == sixButton) {
            displayLabel.setText(currentText + "6");
        } else if (e.getSource() == oneButton) {
            displayLabel.setText(currentText + "1");
        } else if (e.getSource() == twoButton) {
            displayLabel.setText(currentText + "2");
        } else if (e.getSource() == threeButton) {
            displayLabel.setText(currentText + "3");
        } else if (e.getSource() == zeroButton) {
            displayLabel.setText(currentText + "0");
        } else if (e.getSource() == dotButton) {
            displayLabel.setText(currentText + ".");
        } 
        
        // Operation buttons
        else if (e.getSource() == addButton) {
            firstOperand = Double.parseDouble(currentText);
            operator = "+";
            displayLabel.setText("");
        } else if (e.getSource() == minusButton) {
            firstOperand = Double.parseDouble(currentText);
            operator = "-";
            displayLabel.setText("");
        } else if (e.getSource() == mulButton) {
            firstOperand = Double.parseDouble(currentText);
            operator = "x";
            displayLabel.setText("");
        } else if (e.getSource() == divisionButton) {
            firstOperand = Double.parseDouble(currentText);
            operator = "/";
            displayLabel.setText("");
        } 
        
        // Equal button
        else if (e.getSource() == equalButton) {
            secondOperand = Double.parseDouble(currentText);
            double result = 0;
            switch (operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    break;
                case "x":
                    result = firstOperand * secondOperand;
                    break;
                case "/":
                    if (secondOperand != 0) {
                        result = firstOperand / secondOperand;
                    } else {
                        displayLabel.setText("Error");
                        return;
                    }
                    break;
            }
            displayLabel.setText(String.valueOf(result));
            operator = ""; 
        } 
        else if (e.getSource() == clearButton) {
            displayLabel.setText("");
            firstOperand = 0;
            secondOperand = 0;
            operator = "";
        }
    }
    public static void main(String[] args) {
        new Calculator();
    }
}