#include<stdio.h>
int main(){
	float c,f;
	printf("Enter the value of temperature in celcius:\n");
	scanf("%f",&c);
	f=(c*9/5)+32;
	printf("The value of temperature in fahrenheit is: %.3f\n",f);
	
	return 0;
}
