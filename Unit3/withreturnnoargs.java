class withreturnandargs
{
	public static void main(String args[])
	{
		box obj = new box();
		obj.height=10;
		obj.width=20;
		obj.length=50;
		System.out.println("The volume of the box is: " + obj.volume());
	}
}
class box
{
	double height, width , length;
	double volume()
	{
		return (width*height*length);
	}
}
