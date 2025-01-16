/* Write a Java program to demonstrate method overloading and Constructor overloading */

/* Let us write a program to calculate the area of two shapes rectangle and circle using overloading constructors */

class area
{
	area(float r)
	{		
		System.out.println("The area of the cirlce is: " + 3.1415*r*r);
	}
	area(float l,float b)
	{	
		System.out.println("The area of the rectangle is: " + l*b);
	}
}

class ten
{
	public static void main(String args[])
	{
		area objc = new area(7); // Constructor for a circle.
		area objr = new area(7,8); // Constructor for a rectangle.
	}
}


/* A program to find the area of the shapes by overloading methods 

class area
{
	void area(float r)
	{		
		System.out.println("The area of the cirlce is: " + 3.1415*r*r);
	}
	void area(float l,float b)
	{	
		System.out.println("The area of the rectangle is: " + l*b);
	}
}
class Main
{
	public static void main(String args[])
	{
		area obj = new area();
		obj.area(7);
		obj.area(7,8);
	}
}
*/
