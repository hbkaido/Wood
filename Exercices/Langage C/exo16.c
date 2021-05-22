#include <stdio.h>
#include <stdlib.h>

main() {
    int n = 0;

    printf("Entrez un nombre: ");
    scanf("%d", &n);

    if ( n > 0 )

        printf("Ce nombre est positif\n");

    else if ( n == 0 )

        printf("Ce nombre est nul\n");

    else

    printf("Ce nombre est negatif\n");

    system("pause");
}
