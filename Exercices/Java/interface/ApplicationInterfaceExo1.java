package test;

import interfaceExercices.exo1.AMoteur;
import interfaceExercices.exo1.Avion;
import interfaceExercices.exo1.Vehicule;
import interfaceExercices.exo1.Velo;
import interfaceExercices.exo1.Voiture;

import java.util.Arrays;

import heritage.exo1.Personne;

public class ApplicationInterfaceExo1 {

	public static void main(String[] args) {
		Personne jean = new Personne("Durant", "Jean", 31);

		Vehicule[] mesVehicules = new Vehicule[3];
		mesVehicules[0] = new Voiture(230);
		mesVehicules[1] = new Avion(800);
		mesVehicules[2] = new Velo(25);

		for (Vehicule v : mesVehicules) {
			if (v instanceof AMoteur) {
				AMoteur a = (AMoteur) v;
				a.faireLePlein(jean);
			}
			v.transporter(jean);
		}

		Voiture bmw = new Voiture(200);

		Voiture[] voitures = new Voiture[3];
		voitures[0] = bmw;
		voitures[1] = (Voiture) mesVehicules[0];
		voitures[2] = new Voiture(500);

		Arrays.sort(mesVehicules);
	}

}
