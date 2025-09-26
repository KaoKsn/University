#include<stdio.h>
int main(void)
{
	int r1,c1,r2,c2,a[10][10],b[10][10];

	printf("\nMatrix 1.....\n");
	printf("Enter the number of rows in the first matrix: ");
	scanf("%d",&r1);
	printf("Enter the number of columns in the first matrix: ");
	scanf("%d",&c1);

	printf("\nMatrix 2......\n");
	printf("Enter the number of rows in the second matrix: ");
	scanf("%d",&r2);
	printf("Enter the number of columns in the second matrix: ");
	scanf("%d",&c2);

	if( (r1==r2) && (c1==c2) )
	{
		int i,j;
		printf("Enter the first matrix...\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
		 		scanf("%d",&a[i][j]);
		}
		printf("Enter the second matrix....\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				scanf("%d",&b[i][j]);
		}
		//Printing the matrices and their sums.
		printf("\nMatrix 1: \n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",a[i][j]);
			printf("\n");
		}
		printf("\nMatrix 2:\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",b[i][j]);
			printf("\n");
		}
		printf("\nYour added matrix.....\n");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				printf("%d\t",a[i][j]+b[i][j]);
			printf("\n");
		}
	}
	else
		printf("\nIncompatable matrix! These can't be added!!\n");
}


