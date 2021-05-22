package classes;

public class Article extends Document{
	String doi;
	
	public Article(String auteur, String title, int anneeDeParution, String doi) {
		super(title, auteur, anneeDeParution);
		this.doi = doi;
	}
	
	public String toString() {
		return this.title+" de "+this.auteur+" paru en "+this.anneeDeParution+" (DOI = "+this.doi+")";
	}
}