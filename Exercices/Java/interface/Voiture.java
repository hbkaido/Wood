package interfaceExercices.exo1;

import heritage.exo1.Personne;

public class Voiture extends Vehicule implements AMoteur {

	public Voiture(int vitesse) {
		super(vitesse);
	}

	@Override
	public void transporter(Personne p) {
		System.out.println(p + " roule en voiture");
	}

	@Override
	public void faireLePlein(Personne p) {
		System.out.println(p + " fait le plein de la voiture");
	}

}
