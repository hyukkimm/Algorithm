#include <stdio.h>
int main(){
    int a,b=1;
    scanf("%d",&a);
    
    for(b;b<10;b++){
    printf("%d * %d = %d\n",a,b,a*b);
    }
}