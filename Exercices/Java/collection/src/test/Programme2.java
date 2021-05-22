package test;

import classes.AnnuaireInverse;
import classes.NumeroTelephone;
import classes.Personne;

public class Programme2 {
	public static void main(String[] args) {
		Personne martinJean = new Personne("Martin", "Jean");
		Personne durantPierre = new Personne("Durant", "Pierre");
		Personne dupontMarie = new Personne("Dupont", "Marie");
		
		NumeroTelephone numero1 = new NumeroTelephone("0631191939");
		NumeroTelephone numero2 = new NumeroTelephone("0782601142");
		
		AnnuaireInverse annuaire = new AnnuaireInverse();
		annuaire.ajouter(numero1, martinJean);
		annuaire.ajouter(numero2, durantPierre);
		
		System.out.println("Affichage avant l'ajout du numéro déja présent :");
		System.out.println(annuaire);
		System.out.println();
		
		annuaire.ajouter(numero1, dupontMarie);
		System.out.println("Affichage après l'ajout du numéro déja présent :");
		System.out.println(annuaire);
		System.out.println();
		
		System.out.println("Récupération de la personne avec le numéro2 :");
		System.out.println(annuaire.chercher(numero2));
		System.out.println();
		
		annuaire.supprimer(numero2);
		System.out.println("Affichage après la suppression du numéro2 :");
		System.out.println(annuaire);
		System.out.println();
	}
}
