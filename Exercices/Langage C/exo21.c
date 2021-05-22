#include <stdio.h>
#include <stdlib.h>

main() {
    int n, f;

    printf("Entrez un nombre: ");
    scanf("%d", &n);

    f = 1;

    for (int i = 2; i <= n; i++)
        f = f * i;
        printf("La factorielle de ce nombre est: %d", f);

    return 0;
}
