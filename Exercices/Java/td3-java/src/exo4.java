import java.util.Scanner;
public class exo4 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		int[] tab;
		int taille;
		int i, val, j;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
			for (i = 0; i < tab.length; i++)
			{
				System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
				tab[i] = saisie.nextInt();
			}
			
			System.out.println("A quel valeur du tableau voulez vous acceder ?");
	        val = saisie.nextInt();
	        
	        for(j = 0 ; j < tab.length; j++)
		    {
				if(tab[j]==val)
			    {
					System.out.println("Vous avez saisi " + val + " au rang " + (j + 1) );
			    }	
				
		    }
	        
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}