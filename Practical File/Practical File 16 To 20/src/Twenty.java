import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;

class ShapeDrawingSwingApp extends JPanel {
    private List<Shape> shapes;
    private List<Color> colors;
    public ShapeDrawingSwingApp() {
        shapes = new ArrayList<>();
        colors = new ArrayList<>();
        Line2D line = new Line2D.Double(20, 20, 120, 20);
        Rectangle2D rectangle = new Rectangle2D.Double(20, 40, 100, 60);
        RoundRectangle2D roundedRectangle = new RoundRectangle2D.Double(20, 120, 100, 60, 10, 10);
        Rectangle2D filledRectangle = new Rectangle2D.Double(150, 40, 100, 60);
        RoundRectangle2D filledRoundedRectangle = new RoundRectangle2D.Double(150, 120, 100, 60, 10, 10);
        Ellipse2D circle = new Ellipse2D.Double(20, 200, 100, 100);
        Ellipse2D filledEllipse = new Ellipse2D.Double(150, 200, 100, 100);
        Arc2D arc = new Arc2D.Double(20, 330, 100, 100, 45, 180, Arc2D.OPEN);
        Arc2D filledArc = new Arc2D.Double(150, 330, 100, 100, 45, 180, Arc2D.PIE);
        setBackground(Color.black);
        shapes.add(line);
        shapes.add(rectangle);
        shapes.add(roundedRectangle);
        shapes.add(filledRectangle);
        shapes.add(filledRoundedRectangle);
        shapes.add(circle);
        shapes.add(filledEllipse);
        shapes.add(arc);
        shapes.add(filledArc);
        colors.add(Color.red);
        colors.add(Color.green);
        colors.add(Color.blue);
        colors.add(Color.yellow);
        colors.add(Color.cyan);
        colors.add(Color.magenta);
        colors.add(Color.orange);
        colors.add(Color.pink);
        colors.add(Color.white);
        colors.add(new Color(128, 0, 128));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        for (int i = 0; i < shapes.size(); i++) {
            g2d.setColor(colors.get(i));
            g2d.draw(shapes.get(i));
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Shape Drawing Swing App");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new ShapeDrawingSwingApp());
            frame.setSize(400, 500);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}
