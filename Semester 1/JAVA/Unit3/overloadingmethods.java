class overload
{
	void test()
	{
		System.out.println("The function void test() has no parameters!");
	}
	void test(int a)
	{
		System.out.println("This is the parameter for the function void test(int): " + a);
	}
	void test(int a, int b)
	{
		System.out.println("These are the parameters for the function void test(int , int): " + a + " "+ b);
	}
	void test(double a)
	{
		System.out.println("This is the parameter for the function void test(double):" + a); 
	}
}
class overloadingmethods
{
	public static void main(String args[])
	{
		overload obj = new overload();
		obj.test();
		obj.test(10);
		obj.test(10,20);
		obj.test(10.2);
		System.out.println("\nAll the overloaded functions were executed.");
	}
}
