/* Write a C program to read two strings and combine them without using the inbuilt string functions.
*/

#include <stdio.h>

int main(void)
{
	// Reading two strings.
	char s1[40],s2[40];
	printf("Enter the first string:\n");
	fgets(s1,sizeof(s1),stdin);
	printf("Enter the second string:\n");
	fgets(s2,sizeof(s2),stdin);

	/* If you don't remove the newline character included in the input of fgets() you might expect a result like this:

	Enter the first string:
	First
	Enter the second string:
	Second
	The combined String is: First 
	Second

	username@hostname:~$ 
*/

	// To replace the newline character with the endline character from the strings.
	
	int i;
	for(i=0;s1[i]!='\0';i++)
	{
		if(s1[i]=='\n')
			s1[i]= '\0';
	}
	for(i=0;s2[i]!='\0';i++)
	{
		if(s2[i]=='\n')
			s2[i]= '\0';
	}	

	
	// Combining the two strings.
	char sc[80];
	// Combining the two strings.
	for(i=0;s1[i]!='\0';i++)
		sc[i]=s1[i];
	for(int j=0;s2[j]!='\0';i++,j++)
		sc[i]=s2[j];
	sc[i]='\0';
	
	// Printing the combined string.
	printf("The combined String is: %s\n",sc);
}
