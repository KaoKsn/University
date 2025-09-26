// Write a C program to create a number pyramid.
#include<stdio.h>
int main(){
	int n;
	printf("Enter the height of the pyramid:\n");
	scanf("%d",&n);
	printf("Generating the pyramid....\n");
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++)
			printf("%d ",j);
		printf("\n");
	}
	return 0;
}
