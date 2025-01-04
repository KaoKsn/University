class A
{
	A()
	{
		System.out.println("A's constructor statement");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B's constructor statement");
	}
}
class C extends B
{
	C()
	{
		System.out.println("C's constructor statement");
	}
}
class defaultconstructorsinheritence
{
	public static void main(String args[])
	{
		C obj = new C();
	}
}
