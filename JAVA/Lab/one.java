/* Write a Java Program to find the largest of given 3 numbers using ternary operator */

import java.util.Scanner; /* Import the Scanner class from the java.util package */
class one
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in); // Create an object for the Scanner class 
		
		System.out.println("Enter any three integers");
		int a,b,c;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int largest = (a>b) ? ((a>c)?a:c) : ((b>c)?b:c) ;
		System.out.println("The largest of the entered integers is: " + largest);
	}
}


