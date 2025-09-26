// A C program to find the diameter,area and the circumference of a circle of given radius.
#include<stdio.h>
#define pi 3.1415
int main()
{
	float r,area,circumference,d;
	printf("Enter the value of the radius of your circle: \n");
	scanf("%f",&r);
	d=2*r;
	area=pi*r*r;
	circumference=2*pi*r;
	printf("Your circle has a diameter of %.2f units.\nArea of %.3f sq.units.\nCircumfernce of %.3f units.\n",d,area,circumference);
	return 0;
}
