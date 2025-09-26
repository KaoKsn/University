/* Write a Java program to find the largest of the elements of the given array and then find the key element using a linear search algorithm */

import java.util.Scanner;

class algo
{
		algo(int n)
		{
			
			Scanner inp = new Scanner(System.in);

			/* Declaring and Initializing an array. */
			int array[] = new int[n];
		
			/* Getting the elements of the array and subsequently finding the largest of them all */
			System.out.println("\nEnter the elements of your array:");
			for(int i=0;i<n;i++)
						array[i] = inp.nextInt();
		
			int largest = array[0];
			for(int i=0;i<n;i++)
			{
				if(largest<array[i])	
					largest=array[i];
			}

			/* Printing the entered array and the largest of them all. */
			System.out.println("\nThis is the array you entered:");
			for(int i=0;i<n;i++)
				System.out.println(array[i]);
			System.out.println("The largest of them all is: " + largest);

/* Searching........

					/* Asking for the key element */
			System.out.println("\nEnter the key element:");
			int key = inp.nextInt();
		
			for(int i: array)
			{
				if(i==key)
				{
					System.out.println("The key element was found!");
					System.exit(0);
				}
			}
			System.out.println("The key element was not found!");	
		}
}
class seven
{
	public static void main(String args[])
	{
		int num;
		
		/* Getting the size of the array. */		
		System.out.println("Enter the size of your array:");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		algo obj = new algo(num);
	}
}
