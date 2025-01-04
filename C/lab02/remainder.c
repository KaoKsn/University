#include<stdio.h>
int main()
{
	float r,divi,divisor;
	int q;
	printf("Enter the value of dividend:\n");
	scanf("%f",&divi);
	printf("Enter the value of divisor:\n");
	scanf("%f",&divisor);
	q=divi/divisor;
	r=divi-(q*divisor);
	printf("Quotient= %d\nRemainder= %.3f\n",q,r);
	return 0;
}
