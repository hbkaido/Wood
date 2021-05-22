#include <stdio.h>
#include <string.h>

int main()
{
  char str1[10], str2[10];

  printf("Entrez la premiere chaine: ");
  gets(str1);
  printf("Entrez la deuxieme chaine: ");
  gets(str2);

  strcat(str1, str2);

  printf("Apres la concatenation = %s\n", str1);

  return 0;
}
