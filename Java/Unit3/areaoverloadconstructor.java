class area
{
	area(double b, double h)
	{
		System.out.println("The area of a triangle with base: "+ b + " and height: " + h + " is: " + (0.5*b*h) );
	}
	area(int b, int l)
	{
		System.out.println("The area of a rectangle with breadth: "+ b + " and length: " + l + " is: " + (l*b) );
	}
	area(double r)
	{
		double pi= 3.1415;
		System.out.println("The area of a cirlce of radius: " + r + " is: " + (pi*r*r) );
	}
}
class areaoverloadconstructor
{
	public static void main(String args[])
	{
		area obj1 = new area(10.5,20.4);
		area obj2 = new area(10,20);
		area obj3 = new area(7.0);
		System.out.println("\nAll the areas were printed to the console!");
	}
}
