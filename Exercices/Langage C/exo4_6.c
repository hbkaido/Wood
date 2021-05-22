#include <stdio.h>
#include <stdlib.h>

int main()
{
        float Score1, Score2, Score3, Score4, SommeScore;
        float Prcts1, Prcts2, Prcts3, Prcts4;

        printf("**** Entrez les scores ****\n\n");
        printf("Candidat numero 1 :\n");
        scanf("%f",&Score1);
        printf("Candidat numero 2 :\n");
        scanf("%f",&Score2);
        printf("Candidat numero 3 :\n");
        scanf("%f",&Score3);
        printf("Candidat numero 4 :\n");
        scanf("%f",&Score4);

        SommeScore = (Score1 + Score2 + Score3 + Score4);
        printf("Le nombre total de votants est de %f\n\n", SommeScore);

        Prcts1 = (Score1 / SommeScore)*100;
        Prcts2 = (Score2 / SommeScore)*100;
        Prcts3 = (Score3 / SommeScore)*100;
        Prcts4 = (Score4 / SommeScore)*100;

        printf("Le candidat numero 1 a recu %f des voix\n", Prcts1);
        printf("Le candidat numero 2 a recu %f des voix\n", Prcts2);
        printf("Le candidat numero 3 a recu %f des voix\n", Prcts3);
        printf("Le candidat numero 4 a recu %f des voix\n", Prcts4);

        if (Prcts1 > 0.50)
        {
        printf("\nElu des le premier tour !\n");
        }
            else if (Prcts1 < 0.125)
            {
                printf("\nBattu des le premier tour !\n");
            }

            else if (Prcts1 > Prcts2 && Prcts1 > Prcts3 && Prcts1 > Prcts4)
            {
                printf("\nBallotage favorable !\n");
            }
            else
            {
                printf("\nBallotage defavorable !\n");
            }

        return 0;
}
