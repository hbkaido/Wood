import java.util.Scanner;
public class exo9 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		int[] tab;
		int [] t;
		int taille;
		int i, input;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
			for (i = 0; i < tab.length; i++)
			{
				System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
				tab[i] = saisie.nextInt();
			}
			
			System.out.println("\n**** Votre Tableau ****\n");
			
			for (i = 0 ; i < tab.length; i++)
			{
				System.out.println(" | " + tab[i] + " | ");
			}
			
			
			System.out.println("\nVeuillez entrer la nouvelle taille de votre tableau : ");
			input = saisie.nextInt();
			t = new int[input];
			
			for (i = 0; i < tab.length; i++)
			{
				t[i] = tab[i];
			}
			
			for (i = tab.length; i < t.length; i++)
			{
				System.out.println("Veuillez entrer les nouvelles valeurs : ");
				t[i] = saisie.nextInt();
			}
			
			System.out.println("\n**** Votre Nouveau Tableau ****\n");
			
			for (i = 0 ; i < t.length ; i++)
			{
				System.out.println(" | " + t[i] + " | ");
			}
	        
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}