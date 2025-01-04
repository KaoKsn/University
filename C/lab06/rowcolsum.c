#include<stdio.h>
int main(void)
{
	int r,c,a[10][10],sumr[10]={0},sumc[10]={0};

	printf("Enter the number of rows in the matrix: ");
	scanf("%d",&r);
	printf("Enter the number of columns in the matrix: ");
	scanf("%d",&c);

	printf("Enter the matrix...\n");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
	 		scanf("%d",&a[i][j]);
	}
	//Printing the matrix and the sum of elements in the row and column.
	printf("\nMatrix : \n");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
			printf("%d\t",a[i][j]);
		printf("\n");
	}
	
	// Calculating the row sum and column sum.
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
			sumr[i]+=a[i][j];
	}
	printf("\nRow Sums:\n");
	for(int i=0;i<r;i++)
		printf("Sum of elements in row with index [%d] is: %d\n",i,sumr[i]);
	for(int i=0;i<c;i++)
	{
		for(int j=0;j<r;j++)
			sumc[i]+=a[j][i];
	}
	printf("\nColumn Sums:\n");
	for(int i=0;i<c;i++)
		printf("Sum of elements in the column with index[%d] is: %d\n",i,sumc[i]);
}


