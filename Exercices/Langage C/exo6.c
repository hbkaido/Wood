#include <stdio.h>
#include <stdlib.h>

int main(){
    int a = 10;
    int b = 20;
    int tmp = 0;

    printf("%d\n", a);
    printf("%d\n", b);

    a = b;
    b = tmp;
    tmp = a;

    printf("%d\n", a);
    printf("%d\n", b);
    return 0;
    }
