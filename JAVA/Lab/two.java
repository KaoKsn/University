/* Write a Java program to generate the fibonacci series using both while and for loops */

/* 0 1 1 2 3 5 8 ....                  This is the fibonacci series */

import java.util.Scanner;

class fibonacci
{
		int n1=0,n2=1,n3;

		void fiboseries(int x)
		{

				System.out.print(n1 + "  " + n2 + "  ");

				// Using the for loop.
				for(int i=2;i<x;i++)
				{
						n3=n1+n2;
						System.out.println(n3);
						n1=n2;
						n2=n3;
				}


				/* Using the while loop
				   int i=2;
				   while(i<x)
				   {
				   n3=n1+n2;
				   System.out.println(n3);
				   n1=n2;
				   n2=n3;
				   i++;
				   } 
				 */
		}
}
class two
{
		public static void main(String args[])
		{
				// Getting the input from the user.
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the number to generate fibonacci series:");
				int n = input.nextInt();

				fibonacci obj = new fibonacci();
				obj.fiboseries(n);
		}
}
