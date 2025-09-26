/* Write a Java program to demonstrate the use of break statement in the following scenarios:
   1. To exit from any given looping structure.
   2. As a civilized form of "goto".
 */


class four
{
		public static void main(String args[])
		{
				/* Using break to get out of a looping structure. */
				for(int i=0;i<10;i++)
				{
						if(i==2)
							break;
						System.out.println(i);
				}

				/* Using the break statement as a civilized form of goto. */
			first:
				{
					System.out.println("\n\nThis is present in the first block");
			second:			
					{
						System.out.println("This is present in the second block");
			third:	
						{
							System.out.println("This is present in the third block");
							break second;
	 					}
						/* 	System.out.println("This line will not be printed.");	 This is an unreachable line */		
					}
					System.out.println("This line will be printed soon after the break statement is encountered.");	
				}
				System.out.println("This is the last line of the program");
		}
}
