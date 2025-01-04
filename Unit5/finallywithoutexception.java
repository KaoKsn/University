class finallywithoutexception
{
	public static void main(String args[])
	{
		try 
		{
			int a = 5;
			int res = 25/5;
			System.out.println("Res = " + res);
		}
		// The catch block here will not be executed because there is no exception of the kind mentioned in the catch block.
		catch(NullPointerException e)              /* Any other exception can be used. Here e is the error statement */
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("This is the line of code present in the finally block of the program.");
		}
		System.out.println("End of program");
	}
}
