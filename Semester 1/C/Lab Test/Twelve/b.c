/* Write a C program to find the sum and average of the elements of an array using pointers.
*/

#include <stdio.h>

void calculator(float *p,int n)
{
	float sum=0;
	for(int i=0;i<n;i++)
	{
		sum += *(p+i);
	}

	printf("The sum of the elements of your array is: %.3f\n",sum);
	printf("The average of the elements of your array is: %.3f\n",sum/n);
}
int main(void)
{
	int size;
	printf("Enter the size of the array:\n");
	scanf("%d",&size);

	float array[size];
	// Getting the array.
	printf("Enter your array:\n");
	for(int i=0;i<size;i++)
		scanf("%f",&array[i]);

	// Calculating the sum and average of the elements of this array.
	calculator(array,size);
}
