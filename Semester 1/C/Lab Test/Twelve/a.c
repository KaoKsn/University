/* Write a C program to swap two numbers using pointers and display the results.
*/

#include <stdio.h>

int swap(float *p,float* q)
{	
	int temp= *p;
	*p=*q;
	*q=temp;
}

int main(void)
{
	float a,b;
	printf("Enter the two numbers:\n");
	scanf("%f %f",&a,&b);

	// Values before swapping.
	printf("\nBefore swapping..\na = %.2f\tb = %.2f\n",a,b);

	// Call by reference.
	swap(&a,&b);

	// Values after swapping.	
	printf("\nAfter swapping..\na = %.2f\tb = %.2f\n",a,b);
}
