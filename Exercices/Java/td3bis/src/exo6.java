import java.util.Scanner;
public class exo6 {

	public static void recuperationInformation ()
	{
		String nom;
		String prenom;
		int revenu;
		Scanner saisie = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom : ");
        nom = saisie.next();
        System.out.println("Veuillez saisir votre prenom : ");
        prenom = saisie.next();
        System.out.println("Veuillez saisir votre revenu mensuel : ");
        revenu = saisie.nextInt();
        
		saisie.close();
		traitementInformation(nom, prenom, revenu);

	}
	
	public static void traitementInformation (String nom, String prenom, int revenu)
	{
		if (revenu > 2000)
		{
			System.out.println("M. " + nom + " " + prenom + " ne beneficie pas des aides de l'Etat.");
		}
		else if (revenu <= 2000)
		{
			System.out.println("M. " + nom + " " + prenom + " peut beneficier des aides de l'Etat.");
		}
	}
	
	public static void main(String[] args) {
		recuperationInformation();
	}

}

