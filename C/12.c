#include <stdio.h>

int main() {
    int number,sum;
    scanf("%d",&number);
    sum = number;
    while (number != -999) {
        scanf("%d",&number);
        sum+=number;
    }
    printf("%d",sum);
    return 0;
}