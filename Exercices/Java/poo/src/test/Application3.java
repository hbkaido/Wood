package test;

import classes.Pneu;
import classes.Roue;
import classes.Cylindre;
import classes.Moteur;
import classes.Voiture;

public class Application3 {
	public static void main(String[] args) {
		Pneu p1 = new Pneu("Pirelli", 30);
		Roue r1 = new Roue(18, p1);
		Cylindre c1 = new Cylindre(0.5);
		Moteur m1 = new Moteur(c1, 120);
		Voiture v1 = new Voiture("Toyota", "Blanche", m1, r1, " Lalaoui");
		System.out.println("Une voiture " + v1.getMarque() + " de couleur " + v1.getCouleur() + " avec un moteur de puissance " + v1.getMoteur()[0] + ", des roues " + v1.getRoue() + " appartenant a Mr." +v1.getProprietaire());
	}
}
