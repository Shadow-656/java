import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallAnimationSwingApp extends JPanel implements ActionListener {
    private int x = 50; // Initial x-coordinate of the ball
    private int y = 50; // Initial y-coordinate of the ball
    private int xSpeed = 2; // Horizontal speed of the ball
    private int ySpeed = 2; // Vertical speed of the ball
    private Timer timer;

    public BallAnimationSwingApp() {
        timer = new Timer(10, this);
        timer.start();
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.blue);
        g.fillOval(x, y, 50, 50);
    }
    public void actionPerformed(ActionEvent e) {
        x += xSpeed;
        y += ySpeed;
        if (x < 0 || x + 50 > getWidth()) {
            xSpeed = -xSpeed;
        }
        if (y < 0 || y + 50 > getHeight()) {
            ySpeed = -ySpeed;
        }
        repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ball Animation Swing App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new BallAnimationSwingApp());
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
