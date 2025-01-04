//Simple calculator using switch statements in C.
#include<stdio.h>
int main(){
	float a,b;
	char op;
	
	printf("Enter the operator:\n");
	scanf("%c",&op);
	printf("Enter the operands:\n");
	scanf("%f %f",&a,&b);
	
	switch(op){
		case '+':
			printf("The sum of the numbers you entered is: %.3f \n",a+b);
			break;
		case '-':
			printf("The difference of the numbers you entered is: %.3f \n",a-b);
			break;
		case '*':
			printf("The product of the numbers you entered is: %.3f \n",a*b);
			break;
		case '/':
			printf("The quotient of the numbers you entered is: %.3f \n",a/b);
			break;
		default:
			printf("Invalid Operator Entered!\n");
	}
	return 0;
}
