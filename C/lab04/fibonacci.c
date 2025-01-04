// Write a C program to print the fibonacci series.
#include<stdio.h>
int main(){
	int n1=0,n2=1,length,n3;
	printf("Enter the length of the fibonacci series: \n");
	scanf("%d",&length);

	printf("Generating your fibonacci series.....\n");
	printf("%d %d",n1,n2);
	for(int i=2;i<length;i++){
		n3=n2+n1;
		printf(" %d",n3);
		n1=n2;
		n2=n3;
	}
	printf("\n");
	return 0;
}
