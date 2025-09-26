class exceptionhandlingusingtryandcatch
{
	public static void main(String args[])
	{
		int d =0 ,a=42;
		try
		{
			a = a/d ; // Exception encoured as division by zero is not mathematically defined.
			System.out.println("This line will not be printed unless an exception is not found.");
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(a/(d+2));  // This is the line that handles the exception of division by zero.
	}
	System.out.println("End of program");
	/* If d were not equal to zero. Then, the following output can be expected.
	 * This line will not be printed unless an exception is not found.
	 * End of program.
	 */
}
