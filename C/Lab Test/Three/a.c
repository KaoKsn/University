/* Write a C program to peform the following arithematic operations using switch statements:

Operations:
	1. Addition.
	2. Subtraction.
	3. Multiplication.
	4. Division.

NOTE: Perform all the operations on floating point values.
*/

#include <stdio.h>

int main(void)
{
	char op;
	int a,b; // a and b are the operands.
	
	// Asking the user for the desired operation.
	printf("Please enter the required operand:\n");
	scanf("%c",&op);

	// Performing the required operations based on the entered opertor after asking for the desired operands.

	switch(op)
	{

		case '+': 
				printf("Enter the first operand: ");
				scanf("%f",&a);
				printf("Enter the second operand: ");
				scanf("%f",&b);
				printf("The sum of these two numbers is: %.3f\n",a+b);

		case '-': 
				printf("Enter the first operand: ");
				scanf("%f",&a);
				printf("Enter the second operand: ");
				scanf("%f",&b);
				printf("The difference of these two numbers is: %.3f\n",a-b);

		case '*': 
				printf("Enter the first operand: ");
				scanf("%f",&a);
				printf("Enter the second operand: ");
				scanf("%f",&b);
				printf("The product of these two numbers is: %.3f\n",a*b);

		case '/': 
				printf("Enter the first operand: ");
				scanf("%f",&a);
				printf("Enter the second operand: ");
				scanf("%f",&b);
				printf("The quotient of these two numbers is: %.3f\n",a/b);
		
		default:
				printf("Please enter one of the basic four mathematical operators!\n");

	}
}
