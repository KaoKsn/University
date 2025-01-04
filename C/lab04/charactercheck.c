// Create a C program to evaluate the character entered.
#include<stdio.h>
#include<ctype.h>
int main(){
	char c;
	printf("Enter a character here:\n");
	scanf("%c",&c);

	// Evaluating the Character entered.
	if(islower(c))
		printf("You have entered a lower case character.\n");
	else if(isupper(c))
		printf("You have entered a upper case character.\n");
	else if(ispunct(c))
		printf("You have entered a punctuation character.\n");
	else if(isdigit(c))
		printf("You have entered a digit.\n");
	else
		printf("You have entered a whitespace character.\n");
	return 0;
}
