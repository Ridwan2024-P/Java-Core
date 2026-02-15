
interface Shape {

    double calculateArea();
}


class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + radius;
    }
}


class Rectangle implements Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length = " + length + " and width = " + width;
    }
}


class ShapeCalculator {

   
    static void printAreas(Shape... shapes) {
        for (Shape s : shapes) {
           
            System.out.println(s);
            System.out.println("Area = " + s.calculateArea());
          
        }
    }
}


public class LabTwo2 {
    public static void main(String[] args) {

        Shape c1 = new Circle(5);
        Shape r1 = new Rectangle(4, 6);
        Shape c2 = new Circle(3);

        ShapeCalculator.printAreas(c1, r1, c2);
    }
}
