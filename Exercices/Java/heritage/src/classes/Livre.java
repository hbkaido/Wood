package classes;

public class Livre extends Document{
	String isbn;
	
	public Livre(String auteur, String title, int anneeDeParution, String isbn) {
		super(title, auteur, anneeDeParution);
		this.isbn = isbn;
	}
	
	public String toString() {
		return this.title+" de "+this.auteur+" paru en "+this.anneeDeParution+" (ISBN = "+this.isbn+")";
	}
}