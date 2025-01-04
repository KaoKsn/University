class finallywithexceptionnothandled
{
	public static void main(String args[])
	{
		try
		{ 
			System.out.println("Inside try block");
			int res = 25/0;
			System.out.println("This line will not be executed as an exception was encountered.");
		}
		catch(ArithmeticException e) // Here e contains the error statement of the arithmetic exception.
		{
			System.out.println("This is the first line of the catch block for the arithmetic exception");
			System.out.println("Division by zero is not mathematically defined. So res = 25/5 i.e res = " + 25/5);
		}
		finally 
		{
			System.out.println("This is the line of code present in the finally block.");
		}
		// The below statement will be executed as the exception was handled.
		System.out.println("This is the line of code present after the finally block.");
	}
}
