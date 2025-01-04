class superclass
{
	protected int a=10;
	void displaya()
	{
		System.out.println("a: "+ a);
	}
}
class subclass extends superclass
{
	protected int b=20;
	void displayb()
	{
		System.out.println("b: " + b);
	}
	void sum()
	{
		System.out.println("a+b: " + (a+b));
	}
}
/* Trying if you can access the data member b of the class named 'subclass' by creating an object of that class in someother class 
class subclass2
{
	subclass objsub= new subclass();
	void printing()
	{
		System.out.println("This is the value of b present in the subclass subclass: " + objsub.b);
	}
	
}
*/
class Simpleinheritance
{

	public static void main(String args[])
	{
		subclass obj = new subclass();
		obj.displaya();
		obj.displayb();
		obj.sum();
	//	subclass2 objs = new subclass2();
	//	objs.printing();
	}
}
