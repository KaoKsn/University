/* Write a C program to find if a given natural number is prime or not using the concept of user defined function.

The user defined function must not take arguments and also shouldn't return any value.

*/

#include <stdio.h>
#include <stdlib.h>

void prime()
{
	int n;
	do
	{
		printf("Enter a natural number:\n");
		scanf("%d",&n);
	} while (n<=1);
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			printf("Not a Prime Number.\n");
			exit(0);
		}
	}
	printf("Prime Number\n");
}
int main(void)
{
	prime();	
}
