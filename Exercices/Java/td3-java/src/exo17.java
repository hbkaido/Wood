import java.util.Scanner;
public class exo17{
	
	public static void matrice() {
		Scanner input = new Scanner(System.in);
        int [] []T;
        int i, j;
        int S;
        int n = 3;
        
        T = new int[3][3];
        
           //saisie des éléments de la matrice
           for (i = 0; i < n; i++)
           {
        	   for (j = 0; j < n; j++)
               {
        		   System.out.print("Entrer l’element " + (j + 1) + " : ");
                   T[i][j] = input.nextInt();
                }
        	   System.out.print("\n");
           }
           
           //calcul de la somme  des éléments de la diagonale
           
          S = 0;
          for (i = 0; i < n; i++)
          {
        	  S = S + T[i][i];
          }

          for (i = 0; i < n; i++)
          {
        	  for (j = 0; j < n; j++)
        	  {
        		  System.out.print(" | " + T[i][j] + " | ");
        	  }
        	  System.out.print("\n");
          }
          System.out.println("La somme des éléments de la diagonale du tableau est : " + S);
	
	input.close();
	
	}
	
	public static void main(String[] args) 
	{
		matrice();
	}
}