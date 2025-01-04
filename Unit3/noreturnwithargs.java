class test
{
	void function(int a)
	{
		System.out.println("The argument entered to the fucntion void function(int) is: " + a);
	}
}
class noreturnwithargs
{
	public static void main(String args[])
	{
		test obj = new test();
		obj.function(10);
	}
}
