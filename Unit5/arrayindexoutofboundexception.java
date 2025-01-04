class arrayindexoutofboundexception
{
	public static void main(String args[])
	{
		try 
		{
			int a[]={1,3,4,56};
			System.out.println("This is the 11th element of the array a " + a[10]); 
			/* The above line is an exception becuse the size of the array is 4 and the line is trying to access the 11th element of the same.
			 * Any line of code written after the above line of code is not going to be executed because of the exception being encountered.
			 */
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e); // This prints the error message of the ArrayIndexOutOfBoundsException i.e
					       // java.lang.ArrayIndexOutOfBoundsException : Index 10 is out of bound for size 4.
		} 
		System.out.println("End of program");
	}
}
