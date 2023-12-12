#include <stdio.h>

int main() {
    int a,number,min,max,sum;
    a = scanf("%d",&number);
    sum = min = max = a;
    for (int i=0;i<9;i++) {
        scanf("%d",&number);
        sum += number;
        if (number>max) {
            max = number;
        }
        if (number<min) {
            min = number;
    }
}
printf("Min %d \n",min);
printf("Max %d \n",max);
printf("Avg %.2f \n",(float)(sum/10));
}