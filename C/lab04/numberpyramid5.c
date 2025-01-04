#include<stdio.h>
int main(){
	int n,i,j;
	printf("Enter the height of your pyramid:\n");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++){
		int q=n-i+1;
		for(j=n;j>=1;j--){
			if(j<=n+1-i){
				printf("%d ",q);
			}
			else{
				printf(" ");
			}
		}
		printf("\n");
	}
	return 0;
}

