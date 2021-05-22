import java.util.Scanner;
public class exo_point {

	public static void main(String[] args) {
		
		int age, p, acc, cont, somme, somme1;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer l'age du conducteur : ");
		age = saisie.nextInt();
		System.out.println("Titulaire du permis depuis combien d'année ? : ");
		p = saisie.nextInt();
		System.out.println("Veuillez entrer le nombre d'accidents du conducteur : ");
		acc = saisie.nextInt();
		System.out.println("Veuillez entrer la durée du contrat du conducteur : ");
		cont = saisie.nextInt();
		
		if (age < 25)
		{
			age = 1;
		}
		else
			{
				age = 3;
			}
		
		if (p < 2)
		{
			p = 1;
		}
		else
			{
				p = 3;
			}
		
		if (acc == 0)
		{
			acc = 2;
		}
		else if (acc == 1)
			{
				acc = 0;
			}
		else if (acc == 2)
		{
			acc = -2;
		}
		else if (acc >= 3)
		{
			acc = -3;
		}
		
		somme = age + p + acc;
		
		if (somme < 4)
		{
			System.out.println("non assuré");
		}
		
		if (somme == 4)
		{
			System.out.println("tarif rouge");
		}
		
		if (somme == 6)
		{
			System.out.println("tarif orange");
		}
		
		if (somme == 8)
		{
			System.out.println("tarif vert");
		}
		
		if (cont >= 5)
		{
			cont = 2;
			System.out.println("\nCela fait plus de 5 ans que vous nous faites confiance, nous vous remercions pour votre fidelité. Afin de vous recompenser nous ameliorons votre tarif !\n" );
		}
		
		somme1 = somme + cont;
		
		if (somme1 == 6)
		{
			System.out.println("tarif orange !");
		}
		
		if (somme1 == 8)
		{
			System.out.println("tarif vert !");
		}
		
		if (somme1 == 10)
		{
			System.out.println("tarif bleu !");
		}
		
		saisie.close();
	}

}
