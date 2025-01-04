abstract class A
{
	abstract void disp(); // The abstract method present in the abstract class A.
}
class B extends A
{
	void disp()
	{
		System.out.println("The line present in the disp() method of class B.");
	}
}
class C extends B
{
	void disp()
	{
		System.out.println("The line present in the disp() method of class C.");
	}
}
class abstractclasses
{
	public static void main(String args[])
	{
		A r; // reference object of class A.
		r = new B(); // Equivalent to B ob = new B(); r=ob;
		r.disp(); // Displays the contents of method disp() present in the class B.
		r = new C(); // Equivalent to C oc = new C(); c=oc;
		r.disp();  // Displays the contents of method disp() present in the class C.
	}
}
