import java.util.Scanner;
public class exo3 {
	
	public static void tab () {
		Scanner saisie = new Scanner(System.in);
		
		double somme = 0;
		double produit = 1;
		double moyenne = 0;
		int [] tab;
		int taille;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
		for (int i = 0; i < tab.length; i++)
		{
			System.out.println("Veuillez entrer l'élément numéro " + (i + 1));
			tab[i] = saisie.nextInt();
			somme = somme + tab[i];
			produit = produit * tab[i];
		}
		
		moyenne = somme / taille;
		
		System.out.println("\n**** Votre Tableau ****\n");
		
		for (int i: tab)
		{
	        System.out.println(i);
	    }
		
		System.out.println("\n**** Calculs ****");
		System.out.println("\nLa somme des elements du tableau = " + somme);
		System.out.println("Le produit des elements du tableau = " + produit);
		System.out.println("La moyenne des elements du tableau = " + moyenne);
		
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tab();
	}
	
}