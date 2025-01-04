#include<stdio.h>
#include<math.h>

float a,b;

int add()
{	
	printf("Enter the first and the second operands:\n");
	scanf("%f %f",&a,&b);
	printf("The sum: %.3f\n", a+b);
}
int sub()
{
	printf("Enter the first and the second operands:\n");
	scanf("%f %f",&a,&b);
	printf("The difference: %.3f\n", a-b);
}
int mul()
{
	printf("Enter the first and the second operands:\n");
	scanf("%f %f",&a, &b);
	printf("The product: %.3f\n", a*b);
}
int div()
{
	printf("Enter the first and the second operands:\n");
	scanf("%f %f",&a,&b);
	printf("The quotient: %.3f\n", a/b);
}
int rem()
{
	int r1,r2;
	printf("Enter two integers* :\n");
	scanf("%d %d",&r1,&r2);
	printf("Remainder : %d\n", r1%r2);
}

int main(void)
{
	char op;
	printf("Enter the operator required:\n");
	scanf("%c",&op);
	
	switch(op)
	{
		case '+':
				add();
				break;
		case '-':
				sub();
				break;
		case '*':
				mul();
				break;
		case '/': 
				div();
				break;
		case '%':
				rem();
				break;
		default:
				printf("Invalid operator entered!\n");
	}
}
