#include<stdio.h>

int main(void)
{
	int n,a[10],smallest;
	printf("Enter the size of your array:\n");
	scanf("%d",&n);
	printf("Enter your array:\n");
	for(int i=0;i<n;i++)
		scanf("%d",&a[i]);
	
	printf("\nSorting your array in ascending order:\n");
	for(int i=0;i<n;i++)
	{
		smallest=a[i+1];
		for(int j=i+2;j<n;j++)
		{
			if(smallest>a[j])
				smallest=a[j];
		}
		// swap the variable smallest with a[i]
		int swap = smallest;
		smallest=a[i];
		a[i]=smallest;
	}
}
