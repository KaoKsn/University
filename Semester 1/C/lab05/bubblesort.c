// Write a C program for the bubble sort program.
#include<stdio.h>
int main(void)
{
	int n,array[20];
	printf("Enter the size of your array:\n");
	scanf("%d",&n);
	
	if(n!=0)
	{
		int i;
		printf("Enter the elements of your array...\n");
		for(i=0;i<n;i++)
		       scanf("%d",&array[i]);
		
		printf("\nSorting your array...\n");	
		for(i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int swap=array[j];
					array[j]=array[j+1];
					array[j+1]=swap;
				}
			}	
		}

		printf("\nSorted Array......\n");
		for(int i=0;i<n;i++)
			printf("%d\n",array[i]);
	}
	else
		printf("Enter a valid number!\n");
}

