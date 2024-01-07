import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

class SimpleMessageSwingApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Simple Message Swing App");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JLabel label = new JLabel("Hello, This is new.");
                frame.getContentPane().add(label);
                frame.setSize(300, 100);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
