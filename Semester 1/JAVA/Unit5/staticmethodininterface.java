interface a
{
	void method1();
	static void method2()
	{
		System.out.println("This is the body of method 2");
	}
}
class c implements a
{
	public void method1()
	{
		System.out.println("This the body of abstract method method1()");
	}
}
class staticmethodininterface
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.method1();
		a.method2();
	}
}
