/* Write a C program to perform the addition of two matrices(having integer values) using the concepts of two dimensional array */

#include <stdio.h>

int main(void)
{
	int r1,r2,c1,c2;
	
	// Get the size of the first and the second matrix.
	printf("Enter the size of the row of the first matrix:\n");
	scanf("%d",&r1);
	printf("Enter the size of the row of the second matrix:\n");
	scanf("%d",&r2);
	printf("Enter the size of the column of the first matrix:\n");
	scanf("%d",&c1);
	printf("Enter the size of the column of the second matrix:\n");
	scanf("%d",&c2);

	// Checking if the matrices are compatible and adding them if they are.
	if(r1==r2 && c1==c2)
	{
		int a[r1][c1],b[r1][c1],i,j;
		printf("\nThe matrices are compatible.\n");
		printf("\nEnter the first matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				scanf("%d",&a[i][j]);
		}
		printf("Enter the second matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				scanf("%d",&b[i][j]);
		}
	
		// Printing the first,second and the added matrix.
		printf("\nFirst matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",a[i][j]);
			printf("\n");
		}
		printf("\nSecond matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",b[i][j]);
			printf("\n");
		}
		printf("\nAdded matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",a[i][j]+b[i][j]);
			printf("\n");
		}		 
	}
	else
		printf("The matrices are not compatible to be added.\n");
}
	 
