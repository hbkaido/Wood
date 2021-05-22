import java.util.Scanner;
public class exo4_8 {

	public static void main(String[] args) {
		
		int jour, mois, annee;
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le jour : ");
		jour = saisie.nextInt();
		
		if (jour <= 0 || jour > 31)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		}
		
		System.out.println("Veuillez entrer le mois : ");
		mois = saisie.nextInt();
		
		if (mois <= 0 || mois > 12)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		}
		
		if ( (mois == 4 || mois == 6 || mois == 9 || mois == 11 ) && jour > 30)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		}
		
		System.out.println("Veuillez entrer l'année : ");
		annee = saisie.nextInt();
		
		if (annee > 2021)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		}
		
/*b*/	if ( ( ( annee % 4 == 0 && annee % 100 > 0) || ( annee % 400 == 0) ) && mois == 2 && jour > 29)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		} 
/*nb*/	if ( ( annee % 4 > 0 || (annee % 4 == 0 && annee % 100 == 0)  ) && mois == 2 && jour > 28)
		{
			System.out.println("\nDate Invalide");
			System.exit(0);
		}
		
		System.out.println("\nDate Valide");
		saisie.close();
	}

}
