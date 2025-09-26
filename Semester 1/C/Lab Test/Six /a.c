/* Write a C program to print the square of the index of the array. Get the size of the array from the user.
*/

#include <stdio.h>

int main(void)
{	
	// Getting the size of the array.
	int n;
	printf("Enter the size of the array:\n");
	scanf("%d",&n);

	// Printing the index and it's square.
	printf("Index\t\t\t\tSquare of the index\n");
	for(int i=0;i<n;i++)
	{
		printf("%d\t\t\t\t%d\n",i,i*i);	
	}
}
