class A
{
	int a = 10;
	void dispa()
	{
		System.out.println("a: " +a);
	}
}
class B extends A
{
	int b =20;
	void dispb()
	{
		System.out.println("b: " +b);
	}
}
class C extends B
{
	int c=30;
	void dispc()
	{
		System.out.println("c: " +c);
	}
	int sum()
	{
		return a+b+c;
	}
}
class multilevelinheritance
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.dispa();
		obj.dispb();
		obj.dispc();
		System.out.println("The sum of a,b and c is: " + obj.sum());
	}
}

