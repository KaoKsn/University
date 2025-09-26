// Write a binary search program
#include<stdio.h>
#include<stdlib.h>
int main(void)
{
	int n,array[20];
	printf("Enter the size of the array:\n");
	scanf("%d",&n);

	if(n!=0)
	{
		int i,j;
		printf("Enter the elements of your array...\n");
		for(i=0;i<n;i++)
			scanf("%d",&array[i]);
		

		//Sorting the array for binary search.
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(array[j]>array[j+1])
				{
					int swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}
		}
		printf("\nYour sorted array:\n");
		for(i=0;i<n;i++)
			printf("%d\n",array[i]);
		printf("\n");
	

		//Performing the binary search.
		//Asking for the element to search.
		int element;
		printf("Enter the element to search from the above array: ");
		scanf("%d",&element);

		int m=-1,b=0,e=n-1;

		while(b<=e)
		{
			m=(b+e)/2;
			if(array[m]==element)
			{	
				printf("The element you asked for exists in the array in the position: %d\n",m+1);
				exit(0);
			}
			else if(array[m]>element)
			{
				e=m-1;
			}
			else
			{
				b=m+1;
			}
		}
		if(m<0)
			printf("You entered an element that is not in the array you provided.\n");
		else
			printf("The element you asked for exits in the array with the index: %d\n",m);
	}
	else
		printf("Invalid Number!\n");
}
