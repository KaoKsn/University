class withreturnandargs
{
	public static void main(String args[])
	{
		box obj = new box();
		System.out.println("The volume of the box is: " + obj.volume(10,20,50));
	}
}
class box
{
	double volume(double height,double width,double length)
	{
		return (width*height*length);
	}
}
