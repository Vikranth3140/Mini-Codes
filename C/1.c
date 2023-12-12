#include <stdio.h>

int main() {
    int a,b;
    scanf("%d",&a);
    scanf("%d",&b);

    printf("%d \n",a + b);
    printf("%f \n",(float)(a + b)/2);
    printf("%d \n",a*a + b*b);

    return 0;
}