#include<stdio.h>

int fibonacci(int num)
{
	if( (num==0) || (num==1) )
		return num;
	else
		return fibonacci(num-1)+fibonacci(num-2);
}

int main(void)
{
	int n;
	printf("Enter the number to find the fibonacci series:\n");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
		printf("%d\t",fibonacci(i));
	printf("\n");
}

