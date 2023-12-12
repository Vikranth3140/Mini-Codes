#include <stdio.h>

int main() {
    float celsius,fahrenheit;

    scanf("%f",&celsius);
    fahrenheit = (celsius * 9/5) + 32;
    printf("%.1f degrees Celsius converts to %.1f degrees Fahrenheit",celsius,fahrenheit);
    return 0;
}