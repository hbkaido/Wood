import java.util.Scanner;
public class exo19{
	
	public static void matrice() {
		Scanner input = new Scanner(System.in);
        int [] []P;
        int i, j;
        int n;
        
        P = new int[11][11];
        System.out.print("Entrer le degré du triangle (max 10) : ");
        n = input.nextInt();
   
        for (i = 0; i <= n; i++)
        {
        	P[i][i] = 1;
            P[i][0] = 1;
              
           for (j = 1; j <= i - 1; j++)
           {
        	   P[i][j] = P[i-1][j] + P[i-1][j-1];
           }
        }
          
        /* Edition du resultat */
        
        System.out.print("Triangle de Pascal de degré " + n + " : \n");
        
         for (i = 0; i <= n ; i++)
         {
        	 for (j = 0; j <= i; j++) 
        	 {
       		  System.out.print(" | " + P[i][j] + " | ");
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