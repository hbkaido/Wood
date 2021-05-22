import java.util.Scanner;
public class exo4_7 {

	public static void main(String[] args) {
		
		int age, p, acc, cont;
		boolean vert , orange, rouge;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer l'age du conducteur : ");
		age = saisie.nextInt();
		System.out.println("Titulaire du permis depuis combien d'année ? : ");
		p = saisie.nextInt();
		System.out.println("Veuillez entrer le nombre d'accidents du conducteur : ");
		acc = saisie.nextInt();
		System.out.println("Veuillez entrer la durée du contrat du conducteur : ");
		cont = saisie.nextInt();
		
		rouge = (age < 25 && p < 2 && acc == 0) || (age < 25 && p >= 2 && acc >= 1) || (age >= 25 &&  p < 2 && acc >=1) || (age >= 25 && p >= 2 && acc >= 2);
		orange = (age < 25 && p >= 2 && acc == 0) || (age >= 25 &&  p < 2 && acc == 0) || (age >= 25 && p >= 2 && acc >= 1);
		vert = (age >= 25 && p >= 2 && acc == 0);
		
		if (age < 25 && p < 2 && acc == 0)
		{
			System.out.println("tarif rouge");
		}
		else if (age < 25 && p < 2 && acc >=1)
			{
				System.out.println("non assuré");
			}

		if ( (age < 25 && p >= 2 && acc == 0) || (age >= 25 &&  p < 2 && acc == 0) )
		{
			System.out.println("tarif orange");
		}
			else if ( (age < 25 && p >= 2 && acc >= 1) || (age >= 25 &&  p < 2 && acc >=1) )
			{
				System.out.println("tarif rouge");
			}
			else if ( (age < 25 && p >= 2 && acc >= 2) || (age >= 25 &&  p < 2 && acc >=2) )
			{
				System.out.println("non assuré");
			}


		if (age >= 25 && p >= 2 && acc == 0)
		{
			System.out.println("tarif vert");
		}
			else if (age >= 25 && p >= 2 && acc >= 1)
			{
				System.out.println("tarif orange");
			}
			else if (age >= 25 && p >= 2 && acc >= 2)
			{
				System.out.println("tarif rouge");
			}
			else if (age >= 25 && p >= 2 && acc >= 3)
			{
				System.out.println("non assuré");
			}

		if (cont >= 5 && vert)
		{
			System.out.println("\nCela fait plus de 5 ans que vous nous faites confiance, nous vous remercions pour votre fidelité. Afin de vous recompenser nous ameliorons votre tarif !\n" );
			System.out.println("Tarif bleu !");

		}
		
		if (cont >= 5 && orange)
		{
			System.out.println("\nCela fait plus de 5 ans que vous nous faites confiance, nous vous remercions pour votre fidelité. Afin de vous recompenser nous ameliorons votre tarif !\n" );
			System.out.println("Tarif vert !");

		}
		
		if (cont >= 5 && rouge)
		{
			System.out.println("\nCela fait plus de 5 ans que vous nous faites confiance, nous vous remercions pour votre fidelité. Afin de vous recompenser nous ameliorons votre tarif !\n" );
			System.out.println("Tarif orange !");
		}

		saisie.close();
	}

}
