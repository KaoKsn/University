class A 
{
	final void meth()
	{
		System.out.println("This is the contents present in the final method meth() present in the superclass A.");
	}
}
class B extends A
{
	void meth()  // Error! Can't override the method meth() as it is declared as a final method.
	{
		System.out.println("Overriding methods declared as final is illegal in JAVA.");
	}
}
class using_final_to_prevent_overriding
{
	public static void main(String args[])
	{
		System.out.println("The following program is used to show that you cannot override a method declared as final.");
	}
}
