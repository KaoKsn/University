// Write a C program to find the factorial of a number entered by the user.
#include<stdio.h>
int main(){
	int n,factorial=1;
	printf("Enter a number to find the factorial:\n");
	scanf("%d",&n);

	if(n>=0){
	for(int i=2;i<=n;i++)
		factorial*=i;
		printf("The factorial of %d is : %d\n",n,factorial);
	}
	else{
		printf("This number can't have a factorial!\n");
	}
	return 0;
}
