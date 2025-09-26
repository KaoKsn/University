/* Write a C program to convert temperature in a particular scale to another scale. Ask the user if he wants to convert from Celcius to Fahrenheit or vice versa.
*/

#include <stdio.h>

int main(void)
{
		float tempc,tempf;
		
		// Getting the users choice.
		do
		{
				int choice;
				printf("Enter one of the following options:\n 1.Convert from Celcius to Degrees.\n2. Convert from Fahrenhiet to Celcius.\n");
				scanf("%d",&choice);
		}while(choice!=1 || choice!=2)

		// Converting based on the users choice.
		switch(choice)
		{
			case 1: 
					printf("Enter the value of temperature in Celcius:\n");
					scanf("%f",&tempc);
					tempf=tempc*9/5+32;
					printf("The value of the temperature in Fahrenhiet scale is: %3.f\n",tempf);
					break;

			case 2:
					printf("Enter the value of temperature in Fahrenheit:\n");
					scanf("%f",&tempf);
					tempc=(tempf-32)*5/9;
					printf("The value of the temperature in Celcius scale is: %3.f\n",tempc);
					break;
		}
