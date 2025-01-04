// Write a C program to calculate the average of the elements in the array.
#include<stdio.h>
int main(void)
{
	int n,array[20],sum=0;
	float avg;

	// Asking for the size of the array from the user.
	printf("Enter the size of the array:\n");
	scanf("%d",&n);
	
	if(n!=0)
	{
		printf("Enter the elements of your array(line by line)....\n");
		for(int i=0;i<n;i++)
		{
			scanf("%d",&array[i]);
       			sum+=array[i];
		}
		avg=(float)sum/n;
		printf("The average of the elements in your array is: %.3f\n",avg);
	}
	else
		printf("Not a valid number!\n");
}
