interface a
{
	void method1();
	default void method2()
	{
		System.out.println("This is method 2");
	}
}
class c implements a
{
	public void method1() 		/* This is overriding the abstract method method1() of the interface a .
					   If not done, the error
					   defaultmethodsininterfaces.java:9: error: c is not abstract and does not override abstract method method1() in a
					   class c implements a
					   ^
					   1 error
					   is encountered.
					   */

	{
		System.out.println("This is method 1");
	} 
	/* Overriding the default method method2()
	 * public void method2()
	 {
	 System.out.println("Overrided body");
	 }
	 */
}
class defaultmethodsininterfaces
{
	public static void main(String args[])
	{
		c obj = new c();
		obj.method1();
		obj.method2();


		/* Output if you override the default method method2()
		 * This is method 2
		 * Overrided body
		 */
	}
}
