/* Write a Java program to impliment multiple inheritance */

interface a
{
	void read();
}
interface b
{
	void write();
}
class c implements a,b
{
	public void read()
	{
		System.out.println("This is the read() method implemented in the class c.");
	}
	public void write()
	{
		System.out.println("This is the write() method implemented in the class c.");
	}
}
class fifteen
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.read();
		obj.write();	
	}
}
