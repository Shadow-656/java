import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculatorGUI extends JFrame {
    private JTextField resultTextField;
    private String currentInput = "";
    private double result = 0.0;
    private char lastOperator = ' ';
    private boolean isNewInput = true;
    public SimpleCalculatorGUI() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        resultTextField = new JTextField();
        resultTextField.setEditable(false);
        resultTextField.setFont(new Font("Arial", Font.PLAIN, 24));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
        String[] buttonLabels = {
                "7", "8", "9", "+",
                "4", "5", "6", "-",
                "1", "2", "3", "*",
                "0", "/", "%", "C",
                "=", ".", " "
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }
        add(resultTextField, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonLabel = e.getActionCommand();
            if (buttonLabel.equals("C")) {
                clear();
            } else if (buttonLabel.equals("=")) {
                calculateResult();
            } else if (buttonLabel.equals("+") || buttonLabel.equals("-") || buttonLabel.equals("*") || buttonLabel.equals("/")) {
                processOperator(buttonLabel.charAt(0));
            } else if (buttonLabel.equals("%")) {
                calculatePercentage();
            } else {
                appendInput(buttonLabel);
            }
        }
    }
    private void appendInput(String input) {
        if (isNewInput) {
            currentInput = input;
            isNewInput = false;
        } else {
            currentInput += input;
        }
        resultTextField.setText(currentInput);
    }
    private void processOperator(char operator) {
        if (!isNewInput) {
            calculateResult();
        }
        lastOperator = operator;
        isNewInput = true;
    }
    private void calculateResult() {
        try {
            double currentNumber = Double.parseDouble(currentInput);
            switch (lastOperator) {
                case '+':
                    result += currentNumber;
                    break;
                case '-':
                    result -= currentNumber;
                    break;
                case '*':
                    result *= currentNumber;
                    break;
                case '/':
                    if (currentNumber == 0.0) {
                        throw new ArithmeticException("Divide by zero");
                    }
                    result /= currentNumber;
                    break;
                default:
                    result = currentNumber;
            }
            currentInput = Double.toString(result);
            resultTextField.setText(currentInput);
        } catch (NumberFormatException | ArithmeticException ex) {
            clear();
            resultTextField.setText("Error");
        }
    }
    private void calculatePercentage() {
        try {
            double currentNumber = Double.parseDouble(currentInput);
            currentNumber /= 100.0;
            currentInput = Double.toString(currentNumber);
            resultTextField.setText(currentInput);
        } catch (NumberFormatException ex) {
            clear();
            resultTextField.setText("Error");
        }
    }
    private void clear() {
        currentInput = "";
        result = 0.0;
        lastOperator = ' ';
        isNewInput = true;
        resultTextField.setText("");
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCalculatorGUI().setVisible(true);
            }
        });
    }
}
