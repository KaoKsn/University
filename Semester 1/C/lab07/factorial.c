#include<stdio.h>
int factorial(int);

int main(void)
{
	int n;
	printf("Enter a number to find it's factorial:\n");
	scanf("%d",&n);
	if(n>=0)
	{
		printf("The factorial of %d is:%d\n",n,factorial(n));
	}
	else
		printf("Invalid number entered!\n");
}
int factorial(int num)
{
	if( (num==0) || (num==1) )
		return 1;
	else
		return (num*factorial(num-1));
}
