interface a
{
	void method1();
}
interface b
{
	void method2();
}
class c implements b,a
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
class multipleinheritanceviainterfaces
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.method1();
		obj.method2();
	}
}
