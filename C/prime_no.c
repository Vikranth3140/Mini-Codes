#include <stdio.h>
#include <stdbool.h>

int main() {
    int input , i;
    bool flag = false;
    scanf("%d",&input);
    for (i=2;i<input;i++) {
        if (input%i == 0 ) {
            flag = true;
        }
    }

    if (input == 1) {
        printf("It is neither prime not composite");
    }

    if (flag) {
        printf("No");
    }
        else {
        printf("Yes");
    }
    return 0;
}