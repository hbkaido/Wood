import java.util.Scanner;
public class exo2 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		int[] tab;
		int taille;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
			for (int i = 0; i < tab.length; i++)
			{
				System.out.println("Veuillez entrer l'élément numéro " + (i + 1));
				tab[i] = saisie.nextInt();
			}
			
			System.out.println("\n**** Votre Tableau ****\n");
			
			for (int i: tab)
			{
	            System.out.println(i);
	        }
			
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}