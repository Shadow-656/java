interface Shape {
    double calculateArea();
    double calculatePerimeter();
}
interface Drawable extends Shape {
    void draw();
}
class Circle implements Drawable {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}
class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
        circle.draw();
    }
}
