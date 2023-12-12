#include <stdio.h>

int main() {
    float units_l;
    float pi = 3.14159;

    scanf("%f",&units_l);
    printf("The area of a circle of radius %f units is %f units",units_l,units_l*units_l*pi);
    return 0;
}