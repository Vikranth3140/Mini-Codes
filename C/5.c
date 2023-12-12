#include <stdio.h>

int main() {

    char name[10];
    char address[30];
    int class;
    int roll_no;


    scanf("%s",&name);
    scanf("%s",&address);
    scanf("%d",&class);
    scanf("%d",&roll_no);

    printf("%s \n",name);
    printf("%s \n",address);
    printf("%d \n",class);
    printf("%d \n",roll_no);
    return 0;
}