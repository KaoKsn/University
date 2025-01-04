#include<stdio.h>
#include<stdlib.h>

int a[10];

int binary(int,int);
void sort(int);

int main(void)
{
	int n,element;
	printf("Enter the size of your array:\n");
	scanf("%d",&n);
	printf("Enter your array:\n");
	for(int i=0;i<n;i++)
		scanf("%d",&a[i]);
	
	printf("Sorting your array in increasing order:\n");
	sort(n);

	printf("Enter the element to search in the array:\n");
	scanf("%d",&element);
	binary(element,n);
}

void sort(int size)
{
	for(int i=0;i<size;i++)
	{
		for(int j=0;j<size-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				int swap=a[j];
				a[j]=a[j+1];
				a[j+1]=swap;
			}
		}
	}
	printf("Your sorted array:\n");
	for(int i=0;i<size;i++)
		printf("%d\n",a[i]);
}
int binary(int ele,int size)
{
	int b=0,e=size-1,m;
	while(b<=e)
	{
		m= (b+e)/2;
		if(ele==a[m])
		{
			printf("The element was found in the position:%d\n",m+1);
			exit(0);
		}
		else if(a[m]>ele)
			e=m-1;
		else
			b=m+1;
	}
	printf("The element you entered was not found in the array you entered!\n");
}

