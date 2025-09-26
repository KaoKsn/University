//C program to evaluate if a student has passed or failed his exam.
#include<stdio.h>
int main()
{
	float a,b,c,d,f;
	printf("Enter your marks in all the four subjects: \n");
	scanf("%f %f %f %f",&a,&b,&c,&d);
	f=(a+b+c+d)/4;
	if(f>=40)
		printf("You have passed!\n");
	else
		printf("You have failed!\n");
	return 0;
}
