import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class IntegerDivisionUI extends JFrame {
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JButton divideButton;
    private JLabel resultLabel;
    public IntegerDivisionUI() {
        setTitle("Integer Division Calculator");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        num1TextField = new JTextField(10);
        num2TextField = new JTextField(10);
        divideButton = new JButton("Divide");
        resultLabel = new JLabel("Result:");
        setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Num1:"));
        inputPanel.add(num1TextField);
        inputPanel.add(new JLabel("Num2:"));
        inputPanel.add(num2TextField);
        inputPanel.add(divideButton);
        add(inputPanel, BorderLayout.NORTH);
        add(resultLabel, BorderLayout.CENTER);
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1TextField.getText());
                    int num2 = Integer.parseInt(num2TextField.getText());
                    int result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionUI.this, "Please enter valid integers.",
                            "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionUI.this, "Cannot divide by zero.",
                            "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IntegerDivisionUI().setVisible(true);
            }
        });
    }
}
