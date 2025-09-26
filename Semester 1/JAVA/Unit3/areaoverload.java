class area
{
	void area(double b, double h)
	{
		System.out.println("The area of a triangle with base: "+ b + " and height: " + h + " is: " + (0.5*b*h) );
	}
	void area(int b, int l)
	{
		System.out.println("The area of a rectangle with breadth: "+ b + " and length: " + l + " is: " + (l*b) );
	}
	void area(double r)
	{
		double pi= 3.1415;
		System.out.println("The area of a cirlce of radius: " + r + " is: " + (pi*r*r) );
	}
}
class areaoverload
{
	public static void main(String args[])
	{
		area obj = new area();
		obj.area(10.5,20.4);
		obj.area(10,20);
		obj.area(7.0);
		System.out.println("\nAll the areas were printed to the console!");
	}
}
