package classes;

public class Bicyclette {
	String couleur;
	String orientation;
	int nombreDeVitesse;
	int vitesseActuelle; // 1ere, 2e, 3e vitesse...
	int vitesseKm; // en km/h

	public Bicyclette(String couleur, String orientation, int nombreDeVitesse, int vitesseActuelle,
			int vitesseCourante) {
		this.couleur = couleur;
		this.orientation = orientation;
		this.nombreDeVitesse = nombreDeVitesse;
		this.vitesseActuelle = vitesseActuelle;
		this.vitesseKm = vitesseCourante;
	}

	public void tourner(String orientation) {
		this.orientation = orientation;
	}

	public void accelerer(int vitesseAjoute) {
		if (vitesseAjoute > 0) {
			this.vitesseKm = this.vitesseKm + vitesseAjoute;
		}
		this.vitesseAutomatique();
	}

	public void freiner() {
		if (this.vitesseKm >= 10) {
			this.vitesseKm = this.vitesseKm - 10;
		} else {
			this.vitesseKm = 0;
		}
//		if (this.vitesseKm <= 10) {
//			this.changerVitesse(1);
//		} else if (this.vitesseKm <= 20) {
//			this.changerVitesse(2);
//		} else if (this.vitesseKm <= 25) {
//			this.changerVitesse(3);
//		} else {
//			this.changerVitesse(this.vitesseKm / 5 - 2);
//		}
		this.vitesseAutomatique();
	}
	
	public void vitesseAutomatique() {
		if (this.vitesseKm <= 10) {
			this.changerVitesse(1);
		} else if (this.vitesseKm <= 20) {
			this.changerVitesse(2);
		} else {
			this.changerVitesse(this.vitesseKm / 5 - 2);
		}
	}

	public void changerVitesse(int vitesse) {
		if (vitesse <= 0) {
			this.vitesseActuelle = 1;
		}else if ( vitesse > this.nombreDeVitesse) {
			this.vitesseActuelle = this.nombreDeVitesse;
		}else {
			this.vitesseActuelle = vitesse;
		}
	}
	
	public String toString() {
		return "Une bicyclette de couleur "+this.couleur+" tourné vers la/le "+this.orientation+" possédant "+this.nombreDeVitesse+" vitesse et roulant à "+this.vitesseKm+"Km/h en vitesse "+this.vitesseActuelle;
	}
}