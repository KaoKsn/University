interface a
{
	void method1();
}
interface b extends a
{
	void method2();
}
class c implements b
{
	public void method1()
	{
		System.out.println("This is method 1\n");
	}
	public void method2()
	{
		System.out.println("This is method 2");
	}
}
class inheritanceinterfaces
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.method1();
		obj.method2();
	}
}
