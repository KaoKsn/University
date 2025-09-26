#include<stdio.h>
int main(void)
{
	int r,c,a[10][10],i,j;

	printf("Enter the number of rows in the matrix: ");
	scanf("%d",&r);
	printf("Enter the number of columns in the matrix: ");
	scanf("%d",&c);

	printf("Enter the matrix...\n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
	 		scanf("%d",&a[i][j]);
	}
	//Printing the matrix and the transpose.
	printf("\nMatrix : \n");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	printf("\nTranspose of your matrix:\n");
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
			printf("%d\t",a[j][i]);
		printf("\n");
	}
}


