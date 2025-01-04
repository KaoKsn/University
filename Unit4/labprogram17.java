// Create an abstract class called shapes and subclass rectangle, triangle and circle to calculate the areas of each shape using the abstract method called area.
abstract class shape
{
	double b,h,r;
	abstract double area();
}
class triangle extends shape
{
	triangle(double b, double h)
	{
		this.b=b;
		this.h=h;
	}
	double area()
	{
		return 0.5*b*h;
	}
}
class circle extends shape 
{
	circle(double r)
	{
		this.r=r;
	}
	double area()
	{
		return 3.1415*r*r;
	}
}
class rectangle extends shape
{
	rectangle(double b,double h)
	{
		this.b=b;
		this.h=h;
	}
	double area()
	{
		return b*h;
	}
}
class labprogram17
{
	public static void main(String args[])
	{
		shape r;
		r= new triangle(3,6);
		System.out.println("The area of the triangle is : " + r.area() + " sq units");		

		r= new circle(7);
		System.out.println("The area of the circle is : " + r.area()  + " sq units");
		
		r= new rectangle(5.5,4.4);
		System.out.println("The area of the rectangle is : " + r.area() + " sq units");
	}
}
