/* class complex
{
	int real, img;
	complex( int r, int i)
	{
		real=r;
		img=i;
	}

}
class addtwocomplex
{
	public static void main(String args[])
	{
		complex c1 = new complex(2,3);
		complex c2 = new complex(3,4);
		complex c3 = new complex(c1.real+c2.real, c1.img+c2.img);
		System.out.println("The resultant complex number of the addition of c1: " + c1.real + "  + i" + c1.img + " and c2: " + c2.real + " + i" + c2.img + " is \nc3: " + c3.real + " + i" +c3.img);
	}
}
*/
class complex 
{
	int real, img;
	complex()
	{

	}
	complex (int r, int i)
	{
		real=r;
		img =r;
	}

	complex addition( complex c1,complex c2)
	{
		complex c3 = new complex();
		c3.real=c1.real+c2.real;
		c3.img=c1.img+c2.img;
		return c3;
	}
	void display(complex obj)
	{
		if ( obj.img>0)
			System.out.println(real + " + i"+ img);
		else
			System.out.println(real + " - i"+ img);
		
	}
}
class addtwocomplex
{
	public static void main(String args[])
	{
		complex c1 = new complex(2,3);
		complex c2 = new complex(3,4);
		c3 = c3.addition(c1,c2);

		System.out.print("c1: ");
		c1.display();
		System.out.print("c2: ");
		c2.display();
		System.out.print("c3: ");
		c3.display();
	}
}


