class exception
{
	public static void main(String args[])
	{
		int d=0;
		int a = 42/d; 	// Due to the arithematic exception (i.e division by 0) the next lines of code will not be executed.
		// An error message is reported : java.lang.ArithematicException: / by zero.
		System.out.println("This line will not be printed to the console.");
	}
}
