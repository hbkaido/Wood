#include <stdio.h>
#include <stdlib.h>

main() {
    int n, s;

    printf("Entrez un nombre: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
        s = s + i;
        printf("La somme des entiers jusque %d est : %d", n, s);

    return 0;
}
