import java.util.Scanner;
public class exo7 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		int[] tab;
		int taille, i , j, val;
		int k = 0;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
			for (i = 0; i < tab.length; i++)
			{
				System.out.println("Veuillez entrer l'élément numéro " + (i + 1));
				tab[i] = saisie.nextInt();
			}
			
			System.out.println("De quel élément du tableau voulez vous obtenir la derniere occurence ?");
	        val = saisie.nextInt();
			
	        for(j = 0 ; j < tab.length; j++)
		    {
				if(tab[j] == val)
			    {
					k = j;
				}
		    }	
				
	        
	    System.out.println( val + " apparait pour la derniere fois au rang " + (k + 1) + " du tableau");
			
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}