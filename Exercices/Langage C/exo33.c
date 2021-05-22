#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {

    int n = 1 , i , pos , neg;
    float tab[n];

    pos = 0 ;
    neg = 0 ;

    printf("**** DEBUT PROGRAMME ****\n");
    printf("Saisir le nombre de valeurs que vous souhaitez : ");
    scanf("%d", &n);
    printf("\n");

    for(i = 1 ; i <= n ; i++)
    {
        printf("Entrez le nombre : ");
        scanf("%f", &tab[i]);
        printf("\n");

        if (tab[i] < 0)
        {
            neg = neg + 1;
        }
        else if (tab[i] > 0)
        {
            pos = pos + 1;
        }
    }

    printf("Le nombre de valeurs negative est de : %d \n", neg);
    printf("\n\n");
    printf("Le nombre de valeurs positive est de : %d \n", pos);

    return 0;
}
