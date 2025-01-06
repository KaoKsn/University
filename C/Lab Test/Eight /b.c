/* Write a C program to perform the multiplication of two matrices using the concepts of two dimensional array */

#include <stdio.h>

int main(void)
{
	int r1,r2,c1,c2;
	
	// Get the size of the first and the second matrix.
	printf("Enter the size of the row of the first matrix:\n");
	scanf("%d",&r1);
	printf("Enter the size of the column of the first matrix:\n");
	scanf("%d",&c1);
	printf("Enter the size of the row of the second matrix:\n");
	scanf("%d",&r2);
	printf("Enter the size of the column of the second matrix:\n");
	scanf("%d",&c2);

	// Checking if the matrices are compatible and adding them if they are.
	if(c1==r2)
	{
		int i,j;
		float a[r1][c1],b[r2][c2],mul[r1][c2];   // Variable size of mul array doesn't allow the elements to be initialized in the same line as of the declaration.
		printf("\nThe matrices are compatible.\n");

		// Get the matrices.
		printf("\nEnter the first matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				scanf("%f",&a[i][j]);
		}
		printf("Enter the second matrix:\n");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
				scanf("%f",&b[i][j]);
		}
	
		// Printing the first,second and the multiplied matrix.
		printf("\nFirst matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%.2f\t",a[i][j]);
			printf("\n");
		}
		printf("\nSecond matrix:\n");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
				printf("%.2f\t",b[i][j]);
			printf("\n");
		}
		printf("\nMultiplied matrix:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				mul[i][j]=0; // This is because garbage values are present by default.
				for(int k=0;k<c1;k++)
					mul[i][j]+=a[i][k]*b[k][j];
				printf("%.2f\t",mul[i][j]);
			}
			printf("\n");
		}		 
	}
	else
		printf("The matrices are not compatible to be multiplied.\n");
}
	 
