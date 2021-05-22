#include <stdio.h>

main() {
    int na = 0;
    int ht = 0;
    float tva = 0;
    int ttc = 0;

    printf("Entrez le nombre d'article: ");
    scanf("%d", &na);

    printf("Entrez le prix HT: ");
    scanf("%d", &ht);

    printf("Entrez la TVA: ");
    scanf("%f", &tva);

    ttc = na*ht*(1+tva);

    printf("Le prix TTC est de: %d\n", ttc);

    system ("pause");
}
