#include <stdio.h>
#include <stdlib.h>

main() {
    int n = 0;
    int m = 0;

    printf("Entrez un nombre : ");
    scanf("%d", &n);

    printf("Entrez un deuxieme nombre : ");
    scanf("%d", &m);

   if ((n > 0 && m > 0) || (n < 0 && m < 0))

        printf("Le produit est positif\n");

    else

    printf("Le produit est negatif\n");

    system("pause");
}
