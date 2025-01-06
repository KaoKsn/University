/* Write a C program to find the area of the following shapes using switch statements.

Shapes:
	1. Trinagle
	2. Square.
	3. Circle.
	4. Rectangle.
	
NOTE: Take floating point values of every parameter required to calculate the area of these shapes.

*/ 

#include<stdio.h>

int main(void)
{

	int choice;
	float a,b;
							
	// Telling the user how to access each shape.
	printf("\nNOTE:\nSelect the integers that preceed the shape name to find the area of the respective shape.\n);
	printf("\n1.Triangle\n2.Square\n3.Circle\n4.Rectangle\n");

	// Using the switch statements to find the area of desired shape.
	switch(choice)
	{
		case 1:
				printf("Breadth: \n");
				scanf("%f",&a);
				printf("Height: \n");
				scanf("%f",&b);
				printf("The area of your triangle is: %.3f\n",0.5*a*b);

		case 2:
				printf("Length: \n");
				scanf("%f",&a);
				printf("The area of your square is: %.3f\n",a*a);

		case 3:
				printf("Radius: \n");
				scanf("%f",&a);
				printf("The area of your circle is: %.3f\n",3.1414*a*a);

		case 4:
				printf("Length: \n");
				scanf("%f",&a);
				printf("Breadth: \n");
				scanf("%f",&b);
				printf("The area of your rectangle is: %.3f\n",a*b);
		
		default: 
				printf("Please enter a valid integer given in the NOTE!\n");
	}
}
