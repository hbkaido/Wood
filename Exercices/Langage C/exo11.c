#include <stdio.h>

main(){
    float n, c;

    printf("Entrez un nombre: ");
    scanf("%f", &n);

    c = n*n;

    printf("\n\nLe carre de ce nombre est: %f\n", c);
    system("pause");
}
