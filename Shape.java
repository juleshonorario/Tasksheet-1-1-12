interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

public AbstractShape(String color, double length, double width) {
    this.color = color; 
    this.length = length;
    this.width = width;
}

public double calculateArea() {
    return 0.0;
}

public double calculatePerimeter() {
    return 0.0;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Gold", 7.0);
        Rectangle rectangle = new Rectangle("Red", 4.0, 6.0);

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
    }
}