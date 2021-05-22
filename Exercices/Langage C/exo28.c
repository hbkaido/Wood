#include <stdio.h>
#include <stdlib.h>

main() {
    int n, i, t;

    printf("Entrez le nombre de lignes du triangle: ");
    scanf("%d", &n);

    for (int i = 1; i <= n; i++)
    {
        for (int t = 1; t <= i; t++)
        {
            printf("%d", t);
        }
    printf("%d\n", t);
    }
    return 0;
}
