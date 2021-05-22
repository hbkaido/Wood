#include <stdio.h>
#include <stdlib.h>

main() {
    int n = 1;
    int i = 0;
    int pg = 0;
    int ppg;

    while (n!=0)
    {
        printf("Entrez un nombre: ");
        scanf("%d", &n);
        i = i + 1;

        if (i==1 || n > pg)
        {
            pg = n;
            ppg = i;
        }
    }
    printf("Le plus nombre grand est: %d\n", pg);
    printf("Position numero: %d\n", ppg);
    return 0;
}
