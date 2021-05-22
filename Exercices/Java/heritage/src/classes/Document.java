package classes;

public abstract class Document {
	String auteur;
	String title;
	int anneeDeParution;
	
	public Document(String auteur, String title, int anneeDeParution) {
		this.auteur = auteur;
		this.title = title;
		this.anneeDeParution = anneeDeParution;
	}
	
	public String toString() {
		return this.title+" de "+this.auteur+" paru en "+this.anneeDeParution;
	}
}