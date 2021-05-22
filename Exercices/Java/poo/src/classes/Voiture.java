package classes;

public class Voiture {
	String marque;
	String couleur;
	Moteur[] moteur;
	Roue roue;
	String proprietaire;
	
	public Voiture(String marque, String couleur, Moteur moteur, Roue roue, String proprietaire) {
		this.marque = marque;
		this.couleur = couleur;
		this.moteur = new Moteur[4];
		this.moteur[0] = moteur;
		this.moteur[1] = moteur;
		this.moteur[2] = moteur;
		this.moteur[3] = moteur;
		this.roue = roue;
		this.proprietaire = proprietaire;
	}
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Moteur[] getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur[] moteur) {
		this.moteur = moteur;
	}

	public Roue getRoue() {
		return roue;
	}

	public void setRoue(Roue roue) {
		this.roue = roue;
	}

	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	
}
