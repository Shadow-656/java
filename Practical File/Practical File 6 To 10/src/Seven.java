abstract class Shape {
    protected double dimension1;
    protected double dimension2;
    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public abstract void printArea();
}
class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width);
    }
    @Override
    public void printArea() {
        double area = dimension1 * dimension2;
        System.out.println("Rectangle Area: " + area);
    }
}
class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }
    @Override
    public void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Triangle Area: " + area);
    }
}
class Circle extends Shape {
    public Circle(double radius) {
        super(radius, 0);
    }
    @Override
    public void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Circle Area: " + area);
    }
}
class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 10.0);
        Shape triangle = new Triangle(4.0, 6.0);
        Shape circle = new Circle(3.0);
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
