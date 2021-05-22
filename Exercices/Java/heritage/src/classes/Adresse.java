package classes;

public class Adresse {
	int numero;
	String rue;
	String ville;
	int codePostal;
	
	public Adresse(int numero, String rue, String ville, int codePostal) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public String toString() {
		return this.numero+" "+this.rue+" à "+this.ville+" ("+this.codePostal+")";
	}
}