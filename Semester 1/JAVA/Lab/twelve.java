/* Write a Java program to:
	Describe an abstract class called shape, which has three subclasses say,
	1. Triangle
	2. Rectangle
	3. Circle
Define a method area() in abstract class and override this method area() in these three subclasses to calculate the area of the triangle, rectangle and circle.
*/

import java.util.Scanner;

abstract class shape
{
	abstract void area();
}
class triangle extends shape
{
	Scanner input = new Scanner(System.in);
	double b,h;
	public void area()
	{
		System.out.println("Enter the base and height of the triangle:");
		b = input.nextDouble();
		h = input.nextDouble();
		System.out.println("The area is: " + 0.5*b*h);
	}	
}
class rectangle extends shape
{

	Scanner input = new Scanner(System.in);
	double b,h;
	public void area()
	{
		System.out.println("Enter the length and breadth of the rectangle:");
		b = input.nextDouble();
		h = input.nextDouble();
		System.out.println("The area is: " + b*h);
	}	
}
class circle extends shape
{
	Scanner input = new Scanner(System.in);
	double r;
	public void area()
	{
		System.out.println("Enter the radius of the circle:");
		r = input.nextDouble();
		System.out.println("The area is: " + 3.1415*r*r);
	}	
}
class twelve
{
	public static void main(String args[])
	{  
		shape ref;
		ref = new triangle();
		ref.area();
		ref= new rectangle();
		ref.area();
		ref= new circle();
		ref.area();

		/* Or
		triangle objt = new triangle();
		objt.area();
		rectangle objr = new rectangle();
		objr.area();
		circle objc = new circle();
		objc.area();
		*/
	}
}
