/* The following filehandling functions have been used.

   1. fopen()
   2. fgets()
   3. fclose()
   4. fscanf()
   5. fgetc()
   */

/*
   The contents of the file abc.txt is as follows:

   Name		AGE	CITY
   abc		12	Hyderabad
   bcf 		25 	Mysuru
   deg 		40	Bengaluru
   */

#include<stdio.h>
int main(void)
{
	FILE* ptr1 = fopen("abc.txt", "r"); // Opens the file named abc.txt (if it exists) in the read mode.
	if(ptr1 == NULL)
	{
		printf("There is no such file with the name abc.txt \n");
		return 0;
	}

	/* 1. Using the fscanf() function to write the contents of a file in the desired format.
	   Write only the first string of everyline. In this particular instance 
	   */
	printf("Printing desired contents of a file named abc.txt\n");
	char buf[150];
	while(fscanf(ptr1,"%s %*s %*s", buf) == 1)
		printf("%s\n",buf);
	printf("\n");


	// 2. Using the fgets() function to write the complete contents of the file abc.txt.
	printf("Writing the complete contents of the file abc.txt but read the file string by string.\n");
	FILE *ptr2 = fopen("abc.txt", "r");
	if (ptr2 == NULL) {
		printf("There is no such file with the name abc.txt\n");
		return 0;
	}

	char line[256];
	while (fgets(line, sizeof(line), ptr2) != NULL) {
		printf("%s", line);
	}
	printf("\n");
	fclose(ptr2); // This closes the file abc.txt


	// 3. Using the fgetc() fucntion to write the complete contents of the file abc.txt but read the file character by character.
	
	printf("Writing the complete contents of the file abc.txt but reading the file character by character.\n");
	FILE *ptr3 = fopen("abc.txt", "r");
	if (ptr3 == NULL) {
		printf("There is no such file with the name abc.txt\n");
		return 0;
	}

	char ch;
	// Read and print each character until EOF is encountered.
	while ((ch = fgetc(ptr3)) != EOF) {
		putchar(ch);  // Print the character to the screen
	}
	printf("\n");
	fclose(ptr3);
}
