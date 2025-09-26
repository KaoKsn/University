#include<stdio.h>
#include<math.h>

int main(void)
{
	int num,r=0,n;
	int places=0;
	printf("Enter a positive number:\n");
	scanf("%d",&n);
	num=n;
	
	int comparisonnum=num;
	//Calculating the number of places in n;
	while(n!=0)
	{
		n/=10;
		places++;
	}
	
	for(int i=places;num!=0;i--)
	{
		r+= ( (num%10)*(pow(10,i-1)) );
		num/=10;
	}	
	printf("The reverse of the number you entered: %d\n",r);
	if(comparisonnum==r)
		printf("The number is pallindrome.\n");
	else
		printf("The number is not pallindrome!\n");
}
