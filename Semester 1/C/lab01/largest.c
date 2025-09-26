#include<stdio.h>
int main()
{
	float a,b;
	printf("Enter any two numbers:\n");
	scanf("%f %f",&a,&b);
	if(a>b)
		printf("%f is larger.\n",a);
	else if(b>a)
		printf("%f is larger.\n",b);
	else
		printf("Both the numbers are equal.\n");
	return 0;
}
