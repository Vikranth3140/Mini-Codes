#include <stdio.h>

int main() {
    int input1,input2,output;
    int list[] = {};
    scanf("%d \t",&input1);
    scanf("%d \t",&input2);
    int x = input2;

    int f1() {
        int x = x % 10;
        int y = x
    }

    if (input1 == 2) {
        while (int i!= " ") {
            
        }
    }
    elseif (input1 == 8) {
        ......
    }
    elseif (input1 == 16) {
        ......
    }
}

/*
Example -: 1011
1). Take modulo of given binary number with 10. 
    (1011 % 10 = 1)
2). Multiply rem with 2 raised to the power
    it's position from right end. 
    (1 * 2^0)
    Note that we start counting position with 0. 
3). Add result with previously generated result.
    decimal = decimal + (1 * 2^0)
4). Update binary number by dividing it by 10.
    (1011 / 10 = 101)
5). Keep repeating upper steps till binary > 0.
Final Conversion -: (1 * 2^3) + (0 * 2^2) + (1 * 2^1) + (1 * 2^0) = 11
*/