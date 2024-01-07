import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FactorialSwingApplet extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton calculateButton;
    public FactorialSwingApplet() {
        setTitle("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 150);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        inputField = new JTextField(10);
        panel.add(new JLabel("Enter an Integer:"));
        panel.add(inputField);
        resultField = new JTextField(20);
        resultField.setEditable(false);
        panel.add(new JLabel("Factorial:"));
        panel.add(resultField);
        calculateButton = new JButton("Calculate");
        panel.add(calculateButton);
        calculateButton.addActionListener(this);
        getContentPane().add(panel);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == calculateButton) {
            try {
                int input = Integer.parseInt(inputField.getText());
                long factorial = calculateFactorial(input);
                resultField.setText(String.valueOf(factorial));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid Input");
            }
        }
    }
    private long calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FactorialSwingApplet().setVisible(true);
        });
    }
}
