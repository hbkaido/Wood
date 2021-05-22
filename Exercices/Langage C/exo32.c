#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

    int tableau[9];
    int i;

    for (int i = 0; i < 9; i = i + 1)
    {
        printf("Entrez le nombre numero %d: ", i);
        scanf("%d", &tableau [i]);
    }
    printf("Tableau: \n");
    for (i = 0 ; i < 9 ; i = i + 1)
    {
        printf("%d\n", tableau[i]);
    }
    return 0;
}
