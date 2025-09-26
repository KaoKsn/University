/* Write a Java program to add two complex numbers using classes. */

import java.util.Scanner;

class complex
{
    int i,r;

    complex(int x,int y)
    {
        r=x;
        i=y;
    }

    complex add(complex ob)
    {
        return new complex(r+ob.r , i+ob.i); /* Return an object reference variable that references to the object of class complex with
												 real and imaginary part being the sum of each of the other complex numbers.        
		 										 classname objectname = new classname(arg-list);
												 Here classname(complex), objectname(res) */
    }

    void display(complex obj)
    {
		if(obj.i>0)
        	System.out.println(r+ " + " + i + "i");
		else 
			System.out.println(r+ " - " + i + "i");
    }
}

class eight
{
    public static void main(String args[])
    {
		/* Getting the real and imaginary parts of the first and the second complex number that are to be added. */

		int r1,i1,r2,i2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the real and imaginary parts of the first complex number:");
		r1=input.nextInt();
		i1=input.nextInt();
		
		System.out.println("Enter the real and imaginary parts of the second complex number:");
		r2=input.nextInt();
		i2=input.nextInt();


		/* Creating objects to store complex number 1 and complex number 2. */
        complex c1 = new complex(r1,i1);
        complex c2 = new complex(r2,i2);

        complex res= c1.add(c2); // complex res = new complex(r+ob.r, i+ob.i);

       	System.out.print("Complex number 1: ");
		c1.display(c1);
		System.out.print("Complex number 2: ");
        c2.display(c1);
        System.out.print("Sum is ");
        res.display(res); 
    }
}
