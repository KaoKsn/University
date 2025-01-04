#include<stdio.h>
int main(){
	int n;
	printf("Enter the height of the pyramid:\n");
	scanf("%d",&n);
	for(int i=1;i<=n;i++){
		int q=i;
		for(int j=1;j<=i;j++)
			printf("%d ",q);
		printf("\n");
	}
	return 0;
}
