#include <stdio.h>
#include <stdlib.h>

main() {
    int n;

    printf("Entrez un nombre: ");
    scanf("%d", &n);

    printf("Les 10 nombres suivant sont: \t");

    for (int i = n+1; i <= n + 10; i++)
         printf("%d \t", i);

    return 0;
}
