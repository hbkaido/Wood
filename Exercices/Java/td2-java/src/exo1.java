import java.util.Scanner;
public class exo1 {

	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		int n = 1;
		char reponse = 'o';

		while (reponse == 'o')
		{
		        System.out.println("Veuillez entrer un nombre compris entre 1 et 3 : ");
		        n = saisie.nextInt();
		        
		        if (n <= 0 || n > 3)
		        {
		        	System.out.println("\nSaisie Invalide");
		        	System.exit(0);
		        }

		        System.out.println("Vous avez saisi le nombre " + n + "\n");
	            System.out.println("Voulez-vous réessayer ?(o/n)");
	            reponse = saisie.next().charAt(0);
	            
	            while(reponse != 'o' && reponse != 'n')
		        {
		            System.out.println("Mauvaise saisie. Voulez-vous réessayer ?(o/n)");
		            reponse = saisie.next().charAt(0);
		        }
	            
		}
		 
		System.out.println("Saisie validée. Vous avez choisi le nombre " + n);
			
		saisie.close();
	}

}
	
	