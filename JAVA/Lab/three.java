/* Write a Java program to find the factorial of a number and verify if the same is pallindrome or not */


import java.util.Scanner;


class three
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to find its factorial:");
		int n = input.nextInt();

		/* Finding the factorial of the given number. */
		int	facto = factorial(n);
		System.out.println("The factorial of the given number " + n + " is: " + facto);

		/* Checking if the factorial of the given number is a pallidrome or not. */
		System.out.println("The factorial of the given number is pallindrome : " + pallindrome(facto));
		
	}
	static int factorial(int x)
	{
		if(x==0 || x==1)
			return 1;
		else 
			return (x*factorial(x-1));
	}
	static boolean pallindrome(int fact)	
	{
		int rev=0, temp=fact;
		while(fact>0)
		{
			rev = rev*10 + fact/10;
			fact/=10;
		}
		if(rev==fact)
			return true;
		else
			return false;
	}
}

