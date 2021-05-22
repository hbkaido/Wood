package interfaceExercices.exo1;

import heritage.exo1.Personne;

public abstract class Vehicule implements Comparable<Vehicule>{
	private final int vitesse;

	public Vehicule(int vitesse) {
		this.vitesse = vitesse;
	}

	public abstract void transporter(Personne p);

	public int getVitesse() {
		return this.vitesse;
	}
	
	@Override
	public int compareTo(Vehicule o) {
		if (this.getVitesse() == o.getVitesse()) {
			System.out.println("Les deux vehicules sont égaux");
			return 0;
		}else if ( this.getVitesse() < o.getVitesse() ) {
			System.out.println("Le premier véhicule est inférieur au deuxième");
			return -1;
		}else {
			System.out.println("Le premier véhicule est supérieur au deuxième");
			return 1;
		}
	}
}
