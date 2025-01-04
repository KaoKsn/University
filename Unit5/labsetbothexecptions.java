class labsetbothexceptions
{
	public static void main(String args[])
	{
		try
		{
			int c =0;
			System.out.println("c= " + c);
			
			int a[]={1,2,3,4};
			System.out.println(a[10]); // This is an array index out of bounds exception.
			int b = 42/c;
			/*int a[]={1,2,3,4};
			System.out.println(a[10]); // This is an array index out of bounds exception.
				*/
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by 0 is not defined: " + e); // Here e is the error statement of arthimetic execption.
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Requested array index was out of bound: " + e); // Here e is the error statement of the array index out of bounds exception.
		}
		System.out.println("End of program");
	}
	/* The catch block of the first encountered exception is executed in what every case that may occur.
	 */
}
