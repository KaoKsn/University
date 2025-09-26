/* Write a C program to read marks of three students in 3 subjects.  
Calculate the total makrs scored, student wise and subject wise using structure.
*/


#include <stdio.h>

// The required structure.
struct studentprofile
{
	char name[20];
	int roll;
	float marks[3];
	float finalscore;

} student[3];

int main(void)
{
	// Getting the inputs for each student.
	printf("Enter the requested credentials for the students.\n");
	
	for(int i=0;i<3;i++)
	{
		printf("\nStudent %d\n",i+1);
		printf("Name: ");
		fgets(student[i].name,sizeof(student[i].name),stdin);
		printf("Roll Number: ");
		scanf("%d",&student[i].roll);
		printf("\nMarks in 3 subjects(out of 100)..\n");

		student[i].finalscore=0;
		/* The intialization has taken place here because,
		 you can't intialize finalscore in the structure definition.
		*/

		for(int j=0;j<3;j++)
		{
			printf("Subject %d: ",j+1);
			scanf("%f",&student[i].marks[j]);
			student[i].finalscore += student[i].marks[j];
		}
		getchar(); // To ingest the \n left by scanf()
		printf("\n");
	}	

	// Writing the Credentials of each student.
	printf("\nHere are the credentials of each student...\n\n");
	for(int i=0;i<3;i++)
	{
		printf("Student %d\n",i+1);
		printf("Name: %s",student[i].name); // \n not required.
		printf("Roll Number: %d\n",student[i].roll);
		printf("Total Marks : %.3f\n\n",student[i].finalscore);
	}	
}
	
