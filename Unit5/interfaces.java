interface A // An interface is a pure abstract class 
{
	void method1();
}
class B implements A
{
	public void method1()
	{
		System.out.println("Method 1");
	}
}
class interfaces
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.method1();
	}
}
