// 7 - Interfaces and multiple inheritance.
import java.util.Scanner;
interface CircleOps
{
    double circleArea(double r);
    double circlePerimeter(double r);
}
interface RectangleOps
{
    double rectangleArea(double l, double b);
    double rectanglePerimeter(double l, double b);
}
interface ShapeOps extends CircleOps, RectangleOps
{
    void printSummary();
}
class ShapeBase
{
    String name;
    ShapeBase(String name)
    {
        this.name = name;
    }
    final float PI = 3.1415f;
}
class ShapeCalculator extends ShapeBase implements ShapeOps
{
    ShapeCalculator(String name)
    {
        super(name);
    }
    public double circleArea(double r)
    {
        return PI * r * r;
    }
    public double circlePerimeter(double r)
    {
        return 2 * PI * r;
    }
    public double rectangleArea(double l, double b)
    {
        return l * b;
    }
    public double rectanglePerimeter(double l, double b)
    {
        return 2 * (l + b);
    }
    public void printSummary()
    {
        System.out.println("Shape: " + this.name);
    }
}
class ShapesDemo
{
     static public void getShape(ShapeOps shape)
     {
          System.out.println("A general shape initialized!");
     }
     static public void getCircle(CircleOps circle, double r)
     {
        System.out.println("Area: " + circle.circleArea(r));
        System.out.println("Perimeter: " + circle.circlePerimeter(r));
     }
     static public void getRectangle(RectangleOps rectangle, double l,double b)
     {
        System.out.println("Area: " + rectangle.rectangleArea(l, b));
        System.out.println("Perimeter: " + rectangle.rectanglePerimeter(l, b));
     }

}
class Interfaces
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        ShapeCalculator calculator = new ShapeCalculator("Basic Shapes");
        ShapesDemo.getShape(calculator);

	System.out.println("\n== Circle ==");
        System.out.print("Radius: ");
        double r = in.nextDouble();
        ShapesDemo.getCircle(calculator, r);

	System.out.println("\n== Rectangle ==");
        System.out.print("Length: ");
        double l = in.nextDouble();
        System.out.print("Breadth: ");
        double b = in.nextDouble();
        ShapesDemo.getRectangle(calculator, l, b);
        return;
    }
}
