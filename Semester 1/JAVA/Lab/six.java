/* Write a Java program to add any two given matrices */

import java.util.Scanner;

class six
{
		public static void main(String args[])
		{
				/* Setting up the Scanner class object. */
				   Scanner input = new Scanner(System.in);

				int r1=0,r2=0,c1=0,c2=0;		 
				/* Get the sizes of both matrices */
				System.out.println("Enter the number of rows and columns in the first matrix:");	
				r1 = input.nextInt();
				c1 = input.nextInt();

				System.out.println("Enter the number of rows and columns in the second matrix:");	
				r2 = input.nextInt();
				c2 = input.nextInt();

				/* Checking for the compatibility of the matrices and then adding them. */
				if((r1==r2) && (c1==c2))
				{
						/* Getting the matrices.*/
						   int i,j;
						   int m1[][] = new int[r1][c2];
						   int m2[][] = new int[r1][c2];

						   System.out.println("\nEnter the first matrix:");	
						   for(i=0;i<r1;i++)
						   {
						  	 for(j=0;j<c2;j++)
						  		 m1[i][j] = input.nextInt();	
						   }
						   System.out.println("Enter the second matrix:");	
						   for(i=0;i<r1;i++)
						   {
						  	 for(j=0;j<c2;j++)
						   		m2[i][j] = input.nextInt();	
						   }


						/* Printing all the matrices (matrix 1 , matrix 2 and the resultant matrix).*/
						System.out.println("\nThe first matrix is:");	
						for(i=0;i<r1;i++)
						{
								for(j=0;j<c2;j++)
								{
										System.out.print(m1[i][j] + "\t");
								}
								System.out.print("\n");
						}
						System.out.println("The second matrix is:");	
						for(i=0;i<r1;i++)
						{
								for(j=0;j<c2;j++)
								{
										System.out.print(m2[i][j] + "\t");
								}
								System.out.print("\n");
						}
						System.out.println("\nThe Resultant added matrix is:");	
						for(i=0;i<r1;i++)
						{
								for(j=0;j<c2;j++)
								{
									System.out.print(m1[i][j]+m2[i][j] + "\t");
								}							
								System.out.println();
						}
				}
				else
						System.out.println("The entered matrices cannot be added.");	
		}
}
