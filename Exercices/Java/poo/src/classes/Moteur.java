package classes;

public class Moteur {
	Cylindre[] cylindre;
	int puissance;

	public Moteur(Cylindre cylindre, int puissance) {
		this.cylindre = new Cylindre[4];
		this.cylindre[0] = cylindre;
		this.cylindre[1] = cylindre;
		this.cylindre[2] = cylindre;
		this.cylindre[3] = cylindre;
		this.puissance = puissance;
	}
	
	public Cylindre[] getCylindre() {
		return cylindre;
	}

	public void setCylindre(Cylindre[] cylindre) {
		this.cylindre = cylindre;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String toString() {
		return this.puissance+" cv avec des cylindres de dimension "+this.cylindre[0];
	}
	
}
