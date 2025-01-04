// This program shows the flow of control between try and catch blocks when you an exception is found or when not found.
class tryandcatchflow
{
	public static void main(String args[])
	{
		int d =0 , a=42;

		try
		{
			a = a/d; // throws an exception because the value of d=0 and division by 0 is not mathematically defined.
			System.out.println("This line will not be executed if an exception is found.");
		}
		/* Every try block is followed by its corresponding catch block which specifies the kind of exception encountered.
		   In this case an ArithmeticException is found.
		   The catch block is executed only if any exception is found in the try block.
		   */
		catch(ArithmeticException e)
		{
			//System.out.println("This is the custom message for the exception found in the corresponding try block.");
			System.out.println(e);        /* e contains the error statement of the exception encountered.
							 In this case e: java.lang.ArithmeticException: / by zero.
							 */
		}
		System.out.println("End of program");
	}
	/* For any other value of d for which mathematical division is defined, the following output is expected.
	 This line will not be executed if an exception is found
	 End of program.
	 */
}
