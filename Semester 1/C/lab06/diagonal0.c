#include<stdio.h>
int main(void)
{
	int r,c,a[10][10],i,j;

	printf("Enter the number of rows in the matrix: ");
	scanf("%d",&r);
	printf("Enter the number of columns in the matrix: ");
	scanf("%d",&c);
	
	if(r==c)
	{
		printf("Enter the matrix...\n");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
		 		scanf("%d",&a[i][j]);
		}
	
		printf("\nMatrix : \n");
		for(i=0;i<r;i++)
		{	
			for(j=0;j<c;j++)
				printf("%d\t",a[i][j]);
			printf("\n");
		}
		printf("\nUpdated Matrix\n");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
			{
				if( (i==j) || (i+j+1==r))
					printf("0\t");
				else
					printf("%d\t",a[i][j]);
			}
			printf("\n");
		}
	}
	else
		printf("Can't determine the diagonal elements!\n");
}


