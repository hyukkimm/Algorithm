#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int i,n, k,count=0;
	int a[10000];
	scanf("%d %d",&n,&k);


	for (i = 1; i <= n; i++) {
		if ((n % i) == 0) {
			a[count] = i;
			count++;
		}
	}
	if (k <= count) printf("%d", a[k-1]);
	else printf("0");

}