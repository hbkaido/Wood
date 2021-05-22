package interfaceExercices.exo1;

import heritage.exo1.Personne;

public class Velo extends Vehicule {

	public Velo(int vitesse) {
		super(vitesse);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transporter(Personne p) {
		System.out.println(p+" roule en vélo");
	}

}
