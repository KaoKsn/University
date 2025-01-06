/* Write a C program to find the factorial of a number using:
	1. for loop
	2. Recursion 
*/

#include <stdio.h>

int factorial(int number)
{
	if(number==0 || number==1)
		return 1;
	else
		return (number*factorial(number));
}

int main(void)
{
	// Getting the whole number as an input.
	int n,fact=1;

	printf("Enter a whole number:\n");
	scanf("%d",&n);
	
	/* Using a for loop to find the factorial of the given number.
	for(int i=2;i<=n;i++)
		fact*=i;
	printf("The factorial of your number is: %d\n",fact);
 	*/
	
	// Using recursion to find the factorial of the given number.
	printf("The factorial of %d is : %d \n",n,factorial(n));
}	
