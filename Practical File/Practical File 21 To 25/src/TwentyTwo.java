import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CounterSwingApp {
    private int count = 0;
    private JLabel countLabel;
    public CounterSwingApp() {
        JFrame frame = new JFrame("Counter Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        countLabel = new JLabel("Count: " + count);
        countLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(countLabel);
        JButton incrementButton = new JButton("Increment");
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText("Count: " + count);
            }
        });
        panel.add(incrementButton);
        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CounterSwingApp();
            }
        });
    }
}