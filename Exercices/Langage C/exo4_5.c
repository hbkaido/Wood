#include <stdio.h>
#include <stdlib.h>

int main()
{
    int age;
    char input;

    printf("Saisir le sexe (h ou f) : ");
    scanf("%c",&input);

    if (input != 'h' && input != 'f')
    {
        printf("Erreur de saisie, veuillez recommencer.\n");
        return 0;
    }

    printf("Saisir l'age : ");
    scanf("%d",&age);

    if (input == 'h' && age >= 20)
		{
			printf("Imposable");
		}

			else if (input == 'f' && (age > 18 && age < 35) )
			{
				printf("Imposable");
			}

			else
			{
				printf("Non Imposable");
			}

    return 0;
}
