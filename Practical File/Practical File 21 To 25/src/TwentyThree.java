import java.awt.*;
import java.awt.event.*;

class MouseEventDemo extends Frame {
    private String eventName = "";
    public MouseEventDemo() {
        setTitle("Mouse Event Demo");
        setSize(400, 300);
        setLocationRelativeTo(null);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                eventName = "Mouse Clicked";
                repaint();
            }
            public void mousePressed(MouseEvent e) {
                eventName = "Mouse Pressed";
                repaint();
            }
            public void mouseReleased(MouseEvent e) {
                eventName = "Mouse Released";
                repaint();
            }
            public void mouseEntered(MouseEvent e) {
                eventName = "Mouse Entered";
                repaint();
            }
            public void mouseExited(MouseEvent e) {
                eventName = "Mouse Exited";
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
        int textWidth = fm.stringWidth(eventName);
        int x = (getWidth() - textWidth) / 2;
        int y = getHeight() / 2;
        g.drawString(eventName, x, y);
    }
    public static void main(String[] args) {
        new MouseEventDemo();
    }
}
