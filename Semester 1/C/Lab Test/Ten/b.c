/* Write a C program to read two strings and compare them without using the inbuilt string functions.
*/

#include <stdlib.h>
#include <stdio.h>

int main(void)
{
	// Reading two strings.
	char s1[40],s2[40];
	printf("Enter the first string:\n");
	fgets(s1,sizeof(s1),stdin);
	printf("Enter the second string:\n");
	fgets(s2,sizeof(s2),stdin);

	
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

	for(i=0;s1[i]!='\0' && s2[i]!='\0';i++)
	{
		if(s1[i]>s2[i])
		{
			printf("%s is lexicographically greater than %s.\n",s1,s2);
			return 0;
		}
		else if(s1[i]<s2[i])
		{
			printf("%s is lexicographically greater than %s.\n",s2,s1);
			return 0;
		}
	}
	
	/* If the program control reaches here, it means that the strings are similar up untill now. 
		But still there is another case to consider. Like the ones (abc,abcd)
	*/
		
	if(s1[i]=='\0' && s2[i]!='\0')
	{
		printf("%s is lexicographically greater than %s.\n",s2,s1);
		return 0;
	}
	else if(s1[i]!='\0' && s2[i]=='\0')
	{
		printf("%s is lexicographically greater than %s.\n",s1,s2);
		return 0;	
	}
	else
		printf("Both the strings are identical.\n");
}
