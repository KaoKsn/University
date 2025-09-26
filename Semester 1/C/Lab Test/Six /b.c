/* Write a C program to find the sum and average of the elements of any given array containing floating values of any given size.
*/

#include <stdio.h>

int main(void)
{	
	// Get the size of the array.
	int n;
	printf("Enter the size of your array:\n");
	scanf("%d",&n);

	// Get the array
	float a[n],sum=0;
	printf("Enter your array:\n");
	for(int i=0;i<n;i++)
	{
		scanf("%f",&a[i]);
		sum+=a[i];
	}
	
	// Printing the sum and average of the elements of this array.
	printf("Sum of the elements of your array: %.3f\n",sum);
	printf("Average of the elements of your array: %.3f\n,sum/n);
}

