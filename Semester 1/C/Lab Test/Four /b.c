/* Write a C program to read a test score out of 100, calculate the grade for the score and then print the grade based on the criteria given below:

Criteria:
	1. 0-35 gives you an F grade.
	2. 36-50 gives you a D grade.
	3. 51-75 gives you a C grade.
	4. 76-85 gives you a B grade.
	5. 86-100 gives you an A grade.

*/

#include <stdio.h>

int main(void)
{
	float marks;

	// Getting the uesrs test score.
	do
	{
		printf("Enter your test score out of 100:\n");
		scanf("%f",&marks);
	} while(marks>=0 && marks<=100);

	// Grading the student with the marks he has entered.
	if(marks<=35)
	{
		printf("You have received an F grade.\n");
	}
	else if(marks<=50)
	{
		printf("You have received a D grade.\n");
	}
	else if(marks<=75)
	{
		printf("You have received a C grade.\n");
	}
	else if(marks<=85)
	{
		printf("You have received a B grade.\n");
	}
	else 
	{
		printf("You have received an A grade.\n");
	}
}
