/* Write a Java program to:
	Create a Java class called student with the following details as variables within it.
		1. USN
		2. NAME
		3. BRANCH
		4. PHONE
		5. PERCENTAGE.
	 Create n student objects and print the USN, NAME, BRNACH, PHONE and PERCENTAGE of these objects with suitable headings
*/

import java.util.Scanner;

class student
{
	int usn;
	String name,branch;
	long phone;
	float percentage;
	
	// To get the information of the student.
	void getd()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter the following details:\n1.Name \n2. USN\n3.Branch\n4.Phone\n5.Percentage");
		name = input.next();
		usn = input.nextInt();
		branch = input.next();
		phone = input.nextLong();
		percentage = input.nextFloat();
	}
	void dispd()
	{
		System.out.println("Name: " + name);
		System.out.println("USN: " + usn);
		System.out.println("Branch: " + branch);	
		System.out.println("Phone: " + phone);
		System.out.println("Percentage: " + percentage);
	}
}
class nine
{
	public static void main(String args[])
	{
		/* Getting the number of students from the user */
		int n;
		Scanner inpu = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n = inpu.nextInt();
		
		student s[] = new student[n]; // Array of datatype students.
		
		for(int i=0;i<n;i++)
			s[i] = new student(); // Providing the reference to these object reference variables.
		
		/* To get the input of the students */
		for(int i=0;i<n;i++)
		{
			System.out.println("\nEnter the input for Student " + (i+1));
			s[i].getd();
		}
		
		/* To display the input of the students */
		for(int i=0;i<n;i++)
		{
			System.out.println("\nInformation about Student " + (i+1));
			s[i].dispd();
		}

	}		
} 
