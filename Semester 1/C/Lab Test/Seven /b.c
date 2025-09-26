/* Write a C program to sort the elements of an array in the ascending order.
Take an integer array as the input from the user.

Sorting type to use:
					Bubble Sort.

Let elements of the array be integer.

*/

#include <stdio.h>

void bubblesort(int a[],int n)
{
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int swap = a[j];
				a[j] = a[j+1];
				a[j+1] = swap;
			}
		}
	}
	for(int i=0;i<n;i++)
		printf("%d\t",a[i]);
}
int main(void)
{	
	int size;
	printf("Enter the size of array:\n");
	scanf("%d",&size);
	
	// Get the array from the user.
	int array[size];
	printf("Enter the array:\n");
	for(int i=0;i<size;i++)
		scanf("%d",&array[i]);
	
	// Sorting the elements
	bubblesort(array,size);       // This is an example of call by reference.
}
