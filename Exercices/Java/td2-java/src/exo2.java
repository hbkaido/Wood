import java.util.Scanner;
public class exo2 {

	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		int n = 10;
		char reponse = 'o';

		while (reponse == 'o')
		{
		        System.out.println("Veuillez entrer un nombre compris entre 10 et 20 : ");
		        n = saisie.nextInt();
		        
	            while(n < 10 || n > 20)
		        {
		            System.out.println("Mauvaise saisie. Veuillez entrer un nombre compris entre 10 et 20 : ");
		            n = saisie.nextInt();
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
	
	