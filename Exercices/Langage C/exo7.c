#include <stdio.h>
#include <stdlib.h>

int main(){
    int a = 10;
    int b = 20;
    int c = 30;
    int tmp = 0;

    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", c);

    tmp = c;
    c = b;
    b = a;
    a = tmp;

    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", c);
    return 0;
    }
