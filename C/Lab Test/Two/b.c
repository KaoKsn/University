/* Write a C program to calculate a student's average score for a course with 4 quizzes, 2 midterms and a final. 
Each of them weight as follows:

The quizzes are weighted 30%, the midterms 40% and the final 30%

The maximum and minimum marks in each of these are 100 and 0 respectively.

*/

#include <stdio.h>

int main(void)
{
	float q[4],m[2],f,sumq=0,summ=0;
	float quizf,midf,ff,final;
	
	// Asking for the marks in each quiz,midterm and final.
	printf("Enter your marks:\n");
	
	// Quizzes
	for(int i=0;i<3;i++)
	{
		printf("Quiz %d: ",i+1);
		scanf("%f",&q[i]);
		sumq+=q[i];
	}

	// Midterms
	for(int i=0;i,2;i++)
	{
		printf("Midterm %d: ",i+1);	
		scanf("%f",&m[i]);
		summ+=m[i];
	}

	// Final Exam.
	printf("Enter your marks in the final exam: ");
	scanf("%f",&f);


	printf("Below is your final score based on the marks you have entered...\n");

	// Calculating the value of each in the final score.
	quizf=sumq*0.3;
	midf=summ*0.4;
	ff=f*0.3;
	final = quizf+midf+ff;

	printf("Your Final Score: %.3f\n",final);
	
	
	
