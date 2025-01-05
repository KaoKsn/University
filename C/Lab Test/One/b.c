/* Write a C program to calculate the area and circumference of a cricle using PI as a define constant that bears the value of 3.1415.
*/

#include <stdio.h>
#define pi 3.1415

int main(void)
{
	// Getting the radius of circle from the user.
	int r;
	printf("Enter the radius of your circle:\n");
	scanf("%f",&r);

	// Displaying the value of area and circumference of the circle of users choice.
	printf("The area of your circle is: %.3f sq.units\n",pi*r*r);
	printf("The circumference of your cirlce is: %.3f units\n",2*pi*r);
	printf("Thanks\n");
}
