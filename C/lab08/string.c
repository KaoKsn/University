#include<stdio.h>
#include<string.h>

int main(void)
{
	int op;
	char s1[100],s2[100];
	printf("Enter the operation to perform.\n\n1. String length\n2.String Copy.\n3.String Comparison.\n4.String Concatenate.\n5.String Reverse.\n\n");
	scanf("%d",&op);
	getchar();

	switch(op)
	{
		case 1:
			printf("Enter the first string:\n");
			gets(s1,20);
			printf("The length of the string is: %ld\n",strlen(s1));
			break;
		case 2:
			printf("Enter the first string:\n");
			gets(s1,20);
			printf("Enter the second string that has to be copied as the first string:\n");
			gets(s2,20);
			strcpy(s1,s2);
			printf("This is your new string s1: %s\n",s1);
			break;
		case 3:
			printf("Enter the first string:\n");
			gets(s1,20);
			printf("Enter the second string:\n");
			gets(s2,20);
			int r=strcmp(s1,s2);
			break;
		case 4: 
			printf("You have selected to concatenate two strings of your choice:\n");
			printf("Enter the first string:\n");
			gets(s1,20);
			printf("Enter the second string:\n");
			gets(s2,20);
			strcat(s1,s2);
			printf("The concatenated string is:%s\n",s1);
			break;
		case 5:
			printf("Enter the string:\n");
			gets(s1);
			printf("Reversing you string......\n");
			char s2[sizeof(s1)];
			int i=0;

			while(s1[i] != '\0')
			{
					s2[strlen(s1)-i-1] = s1[i];
					i++;
			}
			s2[i] = '\0';

			printf("The reversed string s1 is: %s\n",s2);
			break;
		default:
			printf("You have entered a wrong choice!\n");
	}
}


