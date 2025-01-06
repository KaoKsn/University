/* Write a C program to check if the a positive integer entered is a pallidrome or not.

You cannot use any string functions.

 */

#include <math.h>
#include <stdio.h>

int temp; 

void pallindrome(int n,int size)
{
	int rev=0;
	temp=n;
	// Finding the reverse of that number.
	int i=size-1;
	while(temp!=0)
	{
		rev+= (temp%10)*pow(10,i);
		i--;
		temp/=10;
	}

	if(rev==n)
		printf("The integer entered is pallindrome\n");
	else
		printf("The integer entered is not a pallindrome.\n");
} 

int main(void)
{
	int number,sizenum=0;
	printf("Enter a positive integer:\n");
	scanf("%d",&number);

	temp = number;
	// Calculating the size of number.
	while(temp!=0)
	{
		temp/=10;
		sizenum++;
	}

	// Calling the pallindrome function to check if the number is pallindrome.
	pallindrome(number,sizenum);
}
