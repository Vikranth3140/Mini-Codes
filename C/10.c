#include <stdio.h>

int main() {
    int time_1,time_2,a,b;

    scanf("%d",&time_1);
    scanf("%d",&time_2);

    int add = time_1 + time_2;
    a = add%2400;
    printf("%d",a);
    return 0;
}