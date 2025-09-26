/* Write a C program to find the gcd and lcm of any two given whole numbers using the concept of user defined functions . 

Keep in mind that the user defined function takes arguments does return a value.

*/

#include <stdio.h>

void lcmgcd(int p,int q)
{
	int lcm,gcd;         

	// Calculating gcd.
	int smaller = (p>q)? q : p; // Getting the smaller of the two numbers.

	if(p==0)
		gcd=q;
	else if(q==0)
		gcd=p;
	while(smaller != 0 )	
	{
		if(p%smaller==0 && q%smaller==0)
			gcd=smaller;
		smaller--;            
	}

	// We know that lcm(a,b)*gcd(a,b)=a*b
	lcm=p*q/gcd;
	
	// Printing the values of lcm and gcd
	printf("The GCD of %d and %d is : %d \n",p,q,gcd);
	printf("The LCM of %d and %d is : %d \n",p,q,lcm);

}
int main(void)
{
	// Take any two whole numbers.
	int a ,b;
	printf("Enter any two whole numbers:\n");
	scanf("%d %d",&a,&b);

	// Calling the function void gcd(int,int) with arguments a and b respectively.
	lcmgcd(a,b);
}
