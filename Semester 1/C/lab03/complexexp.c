#include<stdio.h>
int main(){

	int a=3,b=4,c=5,x,y;
	printf("The value of a is %d, b is %d and c is %d.\n",a,b,c);

	x=a*4+b/2-c*b;
	printf("The value of the expression a*4+b/2-c*b is: %d \n",x);

	y=--a*(3+b)/2-c++*b;
	printf("The value of the expression --a*(3+b)/2-c++*b is: %d \n",y);

	printf("The final values of a is: %d, b is %d and c is %d.\n",a,b,c);
	
	return 0;
}
