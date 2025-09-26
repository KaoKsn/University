// Write a C program to print the value of the index and its square side by side for a userdefined array.
#include<stdio.h>
int main(void)
{
	int n,array[20];
	printf("Enter the size of the array:\n");
	scanf("%d",&n);
	printf("\nIndex		Square of Index\n");
	for(int i=0;i<n; i++)
		printf("%d		%d\n",i,i*i);
}
