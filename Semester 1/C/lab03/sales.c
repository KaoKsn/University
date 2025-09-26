#include<stdio.h>
#define tax 8.50
int main(){

	float unitprice,unitsold,discount,priceafterdiscount,finalprice,taxprice;
	printf("Enter the number of units sold:\n");
	scanf("%f",&unitsold);
	printf("Enter the price of each unit:\n");
	scanf("%f",&unitprice);
	discount=unitprice*unitsold*0.1;
	printf("The discount: %f\n",discount);
	priceafterdiscount=unitprice*unitsold-discount;
	printf("The total price of the goods after discount is: %f\n",priceafterdiscount);

	taxprice=priceafterdiscount*0.085;
	printf("The tax price for the goods sold is:%f\n",taxprice);
	finalprice=priceafterdiscount+taxprice;
	printf("The total price of goods sold after adding the tax rate is: %9.2f\n",finalprice);
	return 0;
}
