package interfaceExercices.exo1;

import heritage.exo1.Personne;

public class Avion extends Vehicule implements AMoteur {

	public Avion(int vitesse) {
		super(vitesse);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void faireLePlein(Personne p) {
		System.out.println(p+" fait le plein de l'avion");
	}

	@Override
	public void transporter(Personne p) {
		System.out.println(p+" vole en avion");
	}

}
