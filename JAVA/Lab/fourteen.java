/* Write a Java program to show how the finally block works during execption handling in Java */
import java.util.Scanner;

class fourteen
{
	public static void main(String args[])
	{
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any two integers:");
		a = input.nextInt();
		b = input.nextInt();
		
		int r;
		try
			{	
				r = a/b;
				System.out.println("The value of a/b in integer arithematic is: " + r); // If b=0 then this line will not be executed.	
			}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Division by zero is not allowed!\n");
		}

	/* Demonstrating the ArrayIndexOutOfBoundsException */
		int array[] = new int[3];
		try
		{	
			System.out.println("The 3rd element of the array is: " + array[3]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Array index was out of bound.");
		}

		finally
		{
			System.out.println("This is the code present in the finally block.");
		}
	}
}
