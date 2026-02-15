interface Shape{
    void CalculateArea();
}

class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    public void CalculateArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
class Rectangle implements Shape{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public void CalculateArea(){
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}


public class LabTwo2 {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4, 6);

        Shape[] shapes = {c1, r1};

        for (Shape shape : shapes) {
            shape.CalculateArea();
        }
    }
}
