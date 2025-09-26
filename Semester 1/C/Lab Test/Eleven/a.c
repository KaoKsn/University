/* Write a C program to demonstrate the use of built in functions on strings like:
   1. strcpy()
   2. strlen()
   3. strcmp()
   4. strcat()

 */

#include<stdio.h>
#include<string.h>

int main(void)
{
		// Telling the integers that represent the string functions.

		printf("NOTE:\nEnter the integers next to the function name to perform that function.\n");
		printf("1.strlen()\n2.strcpy()\n3.strcmp()\n4.strcat()\n\n");

		int choice;
		printf("Enter the function to perform:\n");
		scanf("%d",&choice);
		getchar(); // To consume the \n given by scanf()

		char s1[40],s2[40];
		int i;

		switch(choice)
		{
				case 1:
						printf("Enter the string:\n");
						fgets(s1,sizeof(s1),stdin);
						int i;
						for(i=0;s1[i]!='\0';i++)
						{
								if(s1[i]=='\n')
										s1[i]= '\0';
						}
						printf("Length of string %s is: %d",s1,strlen(s1));
						break;
				case 2:
						printf("Enter the first string:\n");
						fgets(s1,sizeof(s1),stdin);
						printf("Enter the second string:\n");
						fgets(s2,sizeof(s2),stdin);
						printf("The first string is now: %s\n",strcpy(s1,s2));
						break;
				case 3:
						printf("Enter the first string:\n");
						fgets(s1,sizeof(s1),stdin);
						printf("Enter the second string:\n");
						fgets(s2,sizeof(s2),stdin);
						printf("The value returned after strcmp(s1,s2) is: %d\n",strcmp(s1,s2));
						break;
				case 4:
						printf("Enter the first string:\n");
						fgets(s1,sizeof(s1),stdin);
						printf("Enter the second string:\n");
						fgets(s2,sizeof(s2),stdin);
						for(i=0;s1[i]!='\0';i++)
						{
								if(s1[i]=='\n')
										s1[i]= '\0';
						}
						for(i=0;s2[i]!='\0';i++) 						// Removing the extra \n character to avoid the format of printing of the final string.
						{
								if(s2[i]=='\n')
										s2[i]= '\0';
						}
						printf("The concatenated string is: %s\n",strcat(s1,s2));
						break;
				default:
						printf("You have entered a wrong choice!\n");
		}
}
