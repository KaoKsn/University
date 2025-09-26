class assignment1
{
	public static void main(String args[])
	{
		student obj = new student();
		obj.display();
	}
}
class student 
{
	String name[]={"s1","s2","s3","s4","s5"},usn[]={"cs01","cs02","cs03","cs04","cs05"},branch="Computer Science and Engineering";
	float sem=1, percentage[]={91,90,80,67,90},phone[]={1,2,3,4,5};
	void display()
	{
		System.out.println("Here the names of the students of the class: \n");
		for(int i=0;i<5;i++)
			System.out.println("Student "+(i+1)+" "+name[i]);
		System.out.println("Here are the USN of the students of the class: \n");
		for(int i=0;i<5;i++)
			System.out.println("Student "+(i+1)+" "+usn[i]);
		System.out.println("\nAll the students belong to \"1st Semester\" from \"The Department of Computer Science and Engineering\"");
		System.out.println("Here are the percentages of the students of the class: \n");
		for(int i=0;i<5;i++)
			System.out.println("Student "+(i+1)+" "+percentage[i]);
		System.out.println("Here are the phone numbers of the students of the class: \n");
		for(int i=0;i<5;i++)
			System.out.println("Stuent "+(i+1)+" "+phone[i]);
	}
}

