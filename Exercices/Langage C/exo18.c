#include <stdio.h>
#include <stdlib.h>

main() {
    int age;

    printf("Entrez l'age de l'enfant: ");
    scanf("%d", &age);

   if (age >= 10)

        printf("Categorie Minime\n");

    else if (age >= 8)

        printf("Categorie Pupille");

    else if (age >= 6)

    printf("Categorie Poussin\n");

    return 0;
}
