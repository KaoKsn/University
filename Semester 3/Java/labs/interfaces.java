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
        return 2 * PI * r;
    }
    public double circlePerimeter(double r)
    {
        return PI * r * r;
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
     static public void getCircle(CircleOps circle)
     {
        System.out.println("Area: " + circle.circleArea(7));
        System.out.println("Perimeter: " + circle.circlePerimeter(7));
     }
     static public void getRectangle(RectangleOps rectangle)
     {
        System.out.println("Area: " + rectangle.rectangleArea(3, 4));
        System.out.println("Perimeter: " + rectangle.rectanglePerimeter(4, 3));
     }

}
class interfaces
{
    public static void main(String args[])
    {
        ShapeCalculator calculator = new ShapeCalculator("Basic Shapes");

        ShapesDemo.getShape(calculator);

	System.out.println("\n== Circle ==");
        ShapesDemo.getCircle(calculator);

	System.out.println("\n== Rectangle ==");
        ShapesDemo.getRectangle(calculator);
        return;
    }
}
