/* Write a C program to find the roots of the quadratic equations by accepting the real floting coefficients a, b, c of any general quadratic equation ax^2+bx+c=0
*/


#include <math.h>
#include <stdio.h>

int main(void)
{
	
	float a,b,c,d;
	float r1,r2; // To store the value of roots.
	// Printing the general form of any quadratic equation on the console.
	printf("NOTE: \nA quadratic equation is of the form:\n ax^2+bx+c\n\n");

	// Getting the coefficients of the quadratic equation.
	printf("Enter the coefficients:\n");
	printf("a: ");
	scanf("%f",&a);
	printf("b: ");
	scanf("%f",&b);
	printf("c: ");
	scanf("%f",&c);

	// Determing the nature of roots by calculating the value of discriminant.
	d= b*b-4*a*c;

	if(d==0)
	{
		printf("The quadratic equation has two real and identical roots.\n");
		printf("Root = %.3f\n",-b/(2*a));
	}
	else if(d>0)
	{
		r1= (-b+sqrt(d))/(2*a);
		r2= (-b-sqrt(d))/(2*a);
		printf("The quadratic equation has two real and distinct roots.\n");
		printf("Root 1 = %.3f\n",r1);
		printf("Root 2 = %.3f\n",r2);
	}
	else
	{
		r1 = -b/(2*a);
		r2 = sqrt(abs(d))/(2*a);
		printf("The quadratic equation has two imaginary roots.\n");
		printf("Root 1 = %.3f + %.3f i \n",r1,r2);
		printf("Root 2 = %.3f - %.3f i \n",r1,r2);
	}
}






