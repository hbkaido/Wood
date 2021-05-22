#include <stdio.h>
#include <stdlib.h>

main() {
    int n, m;

    printf("Entrez deux nombre : ");
    scanf("%d%d", &n, &m);

   if ((n > 0 && m > 0) || (n < 0 && m < 0))

        printf("Le produit est positif\n");

    else if (n == 0 || m == 0)

        printf("Le produit est nul");

    else

    printf("Le produit est negatif\n");

    return 0;
}
