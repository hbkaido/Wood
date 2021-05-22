import java.util.Scanner;
public class exo16{
	
	public static void matrice() {
		Scanner input = new Scanner(System.in);
        int [] []T;
        int i, j;
        int S ,P ,M;
        
        T = new int[2][3];
        
           //saisie des éléments du tableau
           for (i = 0; i < 2; i++)
           {
        	   for (j = 0; j < 3; j++)
               {
        		   System.out.print("Entrer l’element " + (j+1) + " : ");
                   T[i][j] = input.nextInt();
                }
        	   System.out.print("\n");
           }
           
//calcul de la somme ,produit et moyenne
           
           S = 0;
           P = 1;
          for (i = 0; i < 2; i++)
          {
        	  for (j = 0; j < 3; j++)
        	  {
        		  S = S + T[i][j];
                  P = P * T[i][j];
          	  }
          }
          
          M = S/6;

          for (i = 0; i < 2; i++)
          {
        	  for (j = 0; j < 3; j++)
        	  {
        		  System.out.println(" | " + T[i][j] + " | ");
        	  }
        	  System.out.print("\n");
          }
          System.out.println("La somme des éléments du tableau est : " + S);
          System.out.println("Le produit des éléments du tableau est : " + P);
          System.out.println("La moyenne  des éléments du tableau est : " + M);
	
	input.close();
	
	}
	
	public static void main(String[] args) 
	{
		matrice();
	}
}