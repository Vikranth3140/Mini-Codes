#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void permute(int arr[], int l, int r) {
    if (l == r) {
        printf("%d %d %d\n", arr[0], arr[1], arr[2]);
        return;
    }
    for (int i = l; i <= r; i++) {
        swap(&arr[l], &arr[i]);
        permute(arr, l + 1, r);
        swap(&arr[l], &arr[i]);
    }
}

int main() {
    int n;
    printf("Enter a positive integer greater than or equal to 3: ");
    scanf("%d", &n);
    if (n < 3) {
        printf("Invalid input! Please enter a positive integer greater than or equal to 3.\n");
        return 1;
    }
    int arr[3] = {n, n - 1, n - 2};
	permute(arr,0,2);
    return 0;
}