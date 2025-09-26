#include<stdio.h>
#include<stdbool.h>
int main(){

	bool b=true;
       	char c='A';
	float f=245.3;
	int i=3650;
	short s=78;

	printf("bool+char is char:%c\n",b+c); //b+c is 66 i.e B in the ASCII System.
	printf("int*short is int:%d\n",i*s);
	printf("float*char is float:%f\n",f*c);

	c=c+b;
	f=f+c;
	b=false;
	b=-f;

	printf("\nAfter Execution...\n");
	printf("char+true:%c\n",c);
	printf("float+char:%f\n",f);
	printf("bool=-float:%d\n",b);

	return 0;
}
