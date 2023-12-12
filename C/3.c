#include <stdio.h>

int main() {
    
    int sequence[10];
    int i , input , min , max;

    for (i=0 ; i<10 ; i++) {
        scanf("%d",&input);
        sequence[i] = input;
    }
    max = sequence[0];
    min = sequence[0];

    for (i=1 ; i<10 ; i++) {
        if (sequence[i] > max) {
            max = sequence[i];
        }
    }

    for (i=1 ; i<10 ; i++) {
        if (sequence[i] < min) {
            min = sequence[i];
        }
    }

    printf("The minimum is %d\n",min);
    printf("The maximum is %d",max);

    return 0;
}