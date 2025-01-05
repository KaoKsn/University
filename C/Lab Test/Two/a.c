/* Write a C program to calculate the total sales if you are expected to get the follwoing sales parameters from the owner/user:

1. Unit price.
2. Quantity. 
3. Discount.
4. Tax rate. 

*/

#include <stdio.h>
 
int main(void)
{
	int units;
	float ppunit,discountp,discount,taxratesp,tax,netsale;

	// Request for the sales parameters from the user/owner.

	printf("Enter the number of units sold:\n");
	scanf("%d",&units);
	printf("Enter the price per unit sold:\n");
	scanf("%f",&ppunit); 
	printf("Enter the discount percentage:\n");
	scanf("%f",&discount);
	printf("Enter the tax rate in your area(in percentage):\n");
	scanf("%f",&taxrate);

	printf("\nThank you for entering the required details.....\nBelow is our sales report as per the information provided:\n");

	// Calculating the values of the sales parameters.
	discount = discount/100*ppunit*units;
	tax = (ppunit*units - discount)*taxrates/100;
	netsale = (ppunit*units - discount) - tax;

	// Print the sales report. 
	printf("Units sold: %d\n",units);
	printf("Price per unit sold: Rs. %.3f\n",ppunit);
	printf("Total value of goods sold: Rs. %.3f\n",ppunit*units);
	printf("Discount amount of all the goods sold: Rs. %.3f\n",discount);
	printf("Taxes to be paid for the goods sold: Rs. %.3f\n",tax);
	printf("Net sales after cutting taxes off: Rs. %.3f\n",netsale);
}
