class test
{
	int a,b;
	test(int i, int j)
	{
		a=i;
		b=j;
	}
	boolean equals(test obj)
	{
		if(a==obj.a && b==obj.b)
			return true;
		else
			return false;
	}
}
class objectsasparameters
{
	public static void main(String args[])
	{
		test obj1 = new test(10,10);
		test obj2 = new test(10,10);
		test obj3 = new test(-1,1);
		System.out.println("Obj1 == Obj2: " + obj1.equals(obj2) );
		System.out.println("Obj1 == Obj3: " + obj1.equals(obj3) );
		System.out.println("Obj2 == Obj3: " + obj2.equals(obj3) );
	}
}
