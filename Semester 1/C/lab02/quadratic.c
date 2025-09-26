// A simple quadratic equation solver using C.
#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
	float a,b,c,d,r1,r2;

	printf("NOTE:\nA quadratic equation is of the form ax^2+bx+c=0.\n");

	printf("Enter the value of a:\n");
	scanf("%f",&a);
	if(a==0){
		printf("Enter a quadratic equation!\n");
		exit(0);
	}
	printf("Enter the value of b:\n");
	scanf("%f",&b);
	printf("Enter the value of c:\n");
	scanf("%f",&c);
	
	d=b*b-4*a*c;
	
	if(d==0){
		printf("Your quadratic equation has equal and real roots.\n");
		r1=-b/(2*a);
		r2=r1;
		printf("Root 1= %.4f\nRoot 2= %.4f\n",r1,r2);
	}
	else if(d>0)
	{
		printf("Your quadratic equation has real and distinct roots.\n");
		r1=(-b+sqrt(d))/(2*a);
		r2=(-b-sqrt(d))/(2*a);
		printf("Root 1= %.4f\nRoot 2= %.4f\n",r1,r2);
	}
	else{
		printf("Your quadratic equation has imaginary roots.\n");
		r1=-b/(2*a);
		r2=sqrt(fabs(d))/(2*a);
		printf("Root1= %.4f+%.4fi\nRoot2= %.4f-%0.4fi\n",r1,r2,r1,r2);
	}

	return 0;
}
