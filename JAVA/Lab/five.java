/* Write a Java program to print the largest element of any given array. */

import java.util.Scanner;

class five
{
	public static void main(String args[])
	{
		int n;
		
		/* Getting the size of the array. */		
		System.out.println("Enter the size of your array:");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();

		/* Declaring and Initializing an array. */
		int array[] = new int[n];
		
		/* Getting the elements of the array and subsequently finding the largest of them all */
		int largest = 0;
		System.out.println("\nEnter the elements of your array:");
		for(int i=0;i<n;i++)
		{
			array[i] = input.nextInt();
			if(largest<array[i])
				largest = array[i];
		}		

		/* Printing the entered array and the largest of them all. */
		System.out.println("\nThis is the array you entered:");
		for(int i=0;i<n;i++)
			System.out.println(array[i]);
		System.out.println("The largest of them all is: " + largest);
	}
}
