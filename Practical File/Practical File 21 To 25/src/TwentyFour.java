import java.awt.*;
import java.awt.event.*;

class KeyboardEventDemo extends Frame {
    private String keyPressed = "";
    public KeyboardEventDemo() {
        setTitle("Keyboard Event Demo");
        setSize(400, 300);
        setLocationRelativeTo(null);
        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                keyPressed = "Key Pressed: " + KeyEvent.getKeyText(keyCode);
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.setColor(Color.BLACK);
        FontMetrics fm = g.getFontMetrics();
        int textWidth = fm.stringWidth(keyPressed);
        int x = (getWidth() - textWidth) / 2;
        int y = getHeight() / 2;
        g.drawString(keyPressed, x, y);
    }
    public static void main(String[] args) {
        new KeyboardEventDemo();
    }
}
