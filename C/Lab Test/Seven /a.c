/* Write a C program to check for the availability of an element in the array the user provides.
Take an integer array as the input from the user.

Sorting algorithm used:
					Bubble Sort.
Searching algorithm to be used:
								Binary Search.

Let elements of the array be integer.

*/

#include <stdio.h>

void sortandsearch(int a[],int n,int element)
{
	// Sorting the provided array.
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
	
	// Finding for the key element.
	int b=0,e=n-1,m;
	while(b<=e)
	{
		int m = (b+e)/2;
		if(a[m]==element)
			printf("Element was found in the %dth position in your array!\n",m+1);
			exit(0);
		else if(a[m]>element)
			e=m-1;
		else
			b=m+1;
	}
	printf("Element was not found!!\n");				
}
int main(void)
{	
	int size,key;
	printf("Enter the size of array:\n");
	scanf("%d",&size);
	
	// Get the array from the user.
	int array[size];
	printf("Enter the array:\n");
	for(int i=0;i<size;i++)
		scanf("%d",&array[i]);

	// Asking for the key element.
	printf("Enter the element to be found:\n");
	scanf("%d",&key);
	
	// Sorting the elements
	sortandsearch(array,size,key);     // This is an example of call by reference.
}
