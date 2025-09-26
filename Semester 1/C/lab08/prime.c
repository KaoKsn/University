#include<stdlib.h>
#include<stdio.h>
void prime (int number)
{
	for(int i=2;i<=number/2;i++)
	{
		if(number%i==0)
		{
			printf("%d is not a prime number!\n",number);
			exit(0);
		}
	}
	printf("%d is prime.\n",number);
}
int main(void)
{
	int n;
	printf("Note: Prime numbers are those natural numbers >1 whose only divisors are 1 and themselves!\n");
	do
	{
		printf("Enter the number:\n");
		scanf("%d",&n);
	}while(n<=1);
	
	prime(n);
}

