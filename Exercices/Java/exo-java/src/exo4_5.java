import java.util.Scanner;
public class exo4_5 {

	public static void main(String[] args) {
		String input;
		int age;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le sexe (saisir homme ou femme) : ");
		input = saisie.next();
		
		if (!"homme".equals(input) && !"femme".equals(input))
		{
			System.out.println("Erreur de saisie, veuillez recommencer.\n");
			System.exit(0);
		}

		System.out.println("Veuillez entrer l'age : ");
		age = saisie.nextInt();
		
		if (input.equals("homme") && age >= 20)
		{
			System.out.println("Imposable");
		}
		
			else if (input.equals("femme") && (age > 18 && age < 35) )
			{
				System.out.println("Imposable");
			}
		
			else
			{
				System.out.println("Non Imposable");
			}
		
		saisie.close();
	}

}
