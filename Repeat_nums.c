#include <stdio.h>
int main(void) {
	int a[1000];
	int h[2000]={0};
	int i,n;
	scanf("%d",&n);	
	for(i=0;i<n;i++)
	 {
	  scanf("%d",&a[i]);	
	  h[a[i]]++;
	 }
	for(i=0;i<2000;i++)
	{
	 if(h[i]>1)
	 {
	 	printf("%d ",i);
	 }
	}
	return 0;
}
