/* Subclass method has larger priority.
class A
{
	void disp()
	{
		System.out.println("This the the disp() method present in class A.");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("This the the disp() method present in class B.");
	}
}
class methodoverriding
{
	public static void main(String args[])
	{
		B ob = new B();
		ob.disp(); // Executes the contents present in the disp() method present in the class B.
	}	
}
*/
class A
{
	void disp()
	{
		System.out.println("This the the disp() method present in class A.");
	}
}
class B extends A
{
	void disp()
	{
		System.out.println("This the the disp() method present in class B.");
	}
}
class C extends A
{
	void disp()
	{
		System.out.println("This the the disp() method present in class C.");
	}
}
class methodoverriding
{
	public static void main(String args[])
	{
		A oa = new A();
		B ob = new B();
		C oc = new C();

		A r; // Reference object of class A
		r = oa;
		r.disp();
		r = ob;
		r.disp();
		r=oc;
		r.disp(); // The method present in the class C which is a subclass of superclass A.
	}
}
