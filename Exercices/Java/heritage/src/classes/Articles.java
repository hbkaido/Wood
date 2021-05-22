package classes;

import java.util.Random;

public abstract class Articles {
	private double prixUnitaire;
	private String codeBarre;
	
	private static int compteur = 1;
	
	public Articles(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
		this.codeBarre = String.valueOf(compteur);
		compteur = compteur +1;
	}
	
	public double calculCout(int n) {
		return n * this.prixUnitaire;
	}
	
	public String toString() {
		return "Un article à "+this.prixUnitaire+" euro l'unité avec un code barre : "+this.codeBarre;
	}
	
}

