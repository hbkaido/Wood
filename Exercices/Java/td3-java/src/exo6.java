import java.util.Scanner;
public class exo6 {
	
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
			
			System.out.println("De quel élément du tableau voulez vous obtenir la premiere occurence ?");
	        val = saisie.nextInt();
			
			for(j = 0 ; j < tab.length; j++)
		    {
				if(tab[j]==val)
			    {
					k = k + 1;
					if (k == 1)
					{
						System.out.println( val + " apparait pour la premiere fois au rang " + ( j + 1 ) + " du tableau");
						System.exit(0);
					}
			    }	
				
		    }
			
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}