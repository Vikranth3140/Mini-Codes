#include <stdio.h>
#include <math.h>

int main() {
    float cm,inches,feet;

    scanf("%f",&cm);

    feet = (cm/2.54) / 12;
    inches = (feet - floor(feet))*12;

    printf("%f centimeters is %.0f feet %.2f inches",cm,floor(feet),inches);
    return 0;
}