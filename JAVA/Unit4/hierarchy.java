class student
{
	String name="Testing";
	int usn=100;
	void getdata()
	{
		String name="Testing";
		int usn=100;
	}
}
class ug extends student
{
	String branch;
	int sem;
	void getdataug()
	{
		branch="Computer Science";
		sem=1;
	}
	void dispdataug()
	{
		System.out.println("Hello " + name + ", Below are your credentials:\n" + "USN: "+ usn+ "\nBranch: " +branch+ "\nSemester: " + sem);
	}
}
class pg extends student
{
	String branch;
	int sem;
//	void getdatapg();
//	void dispdatapg();
}
class hierarcy
{
	public static void main(String args[])
	{
		ug objug = new ug();
		objug.getdata();
		objug.getdataug();
		objug.dispdataug();
	}
}

