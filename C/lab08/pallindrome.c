#include<stdio.h>
int check(int number)
{
	int temp, rem, rev=0;
	temp=number;

	while(number!=0)
	{
		rem=number%10;
		rev=rev*10+rem;
		number/=10;
	}
	if(rev==temp)
		return 0;
	else
		return 1;
}
main()
{
	int n;
	printf("Enter the number:\n");
	scanf("%d",&n);

	if(check(n)==0)
		printf("%d is pallindrome.\n",n);
	else
		printf("%d is not pallidrome.\n",n);
}
