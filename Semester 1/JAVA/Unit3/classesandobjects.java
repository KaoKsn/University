class classesandobjects
{
	public static void main(String args[])
	{
		Box obj = new Box();
		obj.width=10;
		obj.height=20;
		obj.length=50;
		System.out.println("The volume of the box specified is: "+obj.volume());
	}
}

class Box
{
	double width, height,length;
	double volume()
	{
		return (height*width*length);
	}
}
