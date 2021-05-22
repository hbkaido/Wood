import java.util.Scanner;
public class exo18{
	
	public static void matrice() {
		Scanner input = new Scanner(System.in);
        int [] []T;
        int [] []T1;
        int [] []T2;
        int i, j;
        int n = 3;
        int m = 3;
        int p = 3;
        
        T = new int[n][m];
        T1 = new int[m][p];
        T2 = new int[n][p];
        
           //saisie des éléments des 2 matrices
           for (i = 0; i < n; i++)
           {
        	   for (j = 0; j < m; j++)
               {
        		   System.out.print("Entrer l’element " + (j+1) + " : ");
                   T[i][j] = input.nextInt();
                }
        	   System.out.print("\n");
           }
           
           for (i = 0; i < m; i++)
           {
        	   for (j = 0; j < p; j++)
               {
        		   System.out.print("Entrer l’element " + (j+1) + " : ");
                   T1[i][j] = input.nextInt();
                }
        	   System.out.print("\n");
           }
           
           System.out.println("Matrice 1 : ");
           
           for (i = 0; i < n; i++)
           {
         	  for (j = 0; j < m; j++)
         	  {
         		  System.out.print(" | " + T[i][j] + " | ");
         	  }
         	  System.out.print("\n");
           }
           
           System.out.println("Matrice 2 : ");
           
           for (i = 0; i < m; i++)
           {
         	  for (j = 0; j < p; j++)
         	  {
         		  System.out.print(" | " + T1[i][j] + " | ");
         	  }
         	  System.out.print("\n");
           }
           
          //calcul du,produit des 2 matrices
           
          System.out.println("Matrice Produit : ");
           
          for (i = 0; i < n; i++)
          {
        	  for (j = 0; j < m; j++)
        	  {
        		  for (int k = 0; k < p; k++)
        		  {
        			  T2[i][j] = T2[i][j] + T[i][k] * T1[k][j];
        		  }
          	  }
          }

          for (i = 0; i < n; i++)
          {
        	  for (j = 0; j < p; j++)
        	  {
        		  System.out.print(" | " + T2[i][j] + " | ");
        	  }
        	  System.out.print("\n");
          }
	
	input.close();
	
	}
	
	public static void main(String[] args) 
	{
		matrice();
	}
}