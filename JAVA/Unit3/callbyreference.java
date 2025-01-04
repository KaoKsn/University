class test
{
	int a,b;
	test(int i,int j) 
	{
		a=i;
		b=j;
	}
	void fun(test obj)
	{
		obj.a*=2; 
		obj.b/=2;
	}
}
class callbyreference
{
	public static void main(String args[])
	{
		test ob = new test(15,20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.fun(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	} 	
}


