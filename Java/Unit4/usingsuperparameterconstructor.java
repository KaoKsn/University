class A
{
	int a,b;
	A(int i)
	{
		a=i;
	}
	void display()
	{
		System.out.println("The value of a present in the superclass is: " + a );
	}
}
class B extends A
{
	int a,b;
	B(int j)
	{
		super(j); // This assigns the value of j to i(the argument for the constructor of the superclass A).
		super.b = 20; // The value 20 is assigned to the b present in the superclass A.
		b=21;
		a=j+1; // This a is the instance varible of the class B.
	}
	void display()
	{
		super.display(); // This invokes the display() method present in the superclass A.
		System.out.println("The value of varible a present in the subclass is: " +a);
	}
}
class usingsuperparameterconstructor
{
	public static void main(String args[])
	{
		B obj = new B(10); // This value of 10 is first assigned to j and then j is assigned to i.
		obj.display();
		// You cannot use the super.display() here to execute the lines of code present in the display method of the superclass A.

		/* If both the methods in both the classes are named differently.
	 	obj.displaya();
		obj.displayb();
		*/	

	}
}
