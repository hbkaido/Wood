import java.util.Scanner;
public class exo10 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		
		int somme, argent, rendu, b10, b5, p1;
		int i;
		int[] tab;
		int article;
		
		System.out.println("Veuillez entrer le nombre d'articles : ");
		article = saisie.nextInt();
		tab = new int[article];
		
			for (i = 0; i < tab.length; i = i + 1)
			{
				System.out.println("Veuillez entrer le prix de l'article n° " + (i + 1));
				tab[i] = saisie.nextInt();
			}
			
		somme = java.util.stream.IntStream.of(tab).sum();
		System.out.println("Vous devez " + somme + " EUR");
		
		System.out.println("Veuillez regler votre achat : ");
		argent = saisie.nextInt();
		
		rendu = argent - somme;
		
		if (rendu < 0)
		{
			while (rendu < 0)
			{	
				rendu = rendu * -1;
				System.out.println("Il manque " + rendu +  " EUR, veuillez regler la somme restante : ");
				argent = saisie.nextInt();
				rendu = argent - rendu;
			}
		}
		
		if (rendu > 0)
		{
			
			b10 = rendu/10;
			rendu = rendu%10;
			b5 = rendu/5;
			rendu = rendu%5;
			p1 = rendu;

			System.out.format("Rendu de %d billet(s) de 10 EUR\n", b10);
			System.out.format("Rendu de %d billet(s) de 5 EUR\n", b5);
			System.out.format("Rendu de %d piece(s) de 1 EUR\n", p1);
		}
		
		if (rendu == 0)
		{
			System.out.println("Achat payé, passez une bonne journée !");
			System.exit(0);
		}
		
		System.out.println("Achat payé, passez une bonne journée !");
		
		System.exit(0);
		saisie.close();
	}

}
