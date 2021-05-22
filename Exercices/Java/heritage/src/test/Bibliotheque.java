package test;

import classes.Livre;
import classes.Article;
import classes.Document;
import classes.Adresse;

public class Bibliotheque {
	String nom;
	Adresse adresse;
	Document [] documents;
	
	public Bibliotheque(String nom, Adresse adresse, Document[] documents) {
		this.nom = nom;
		this.adresse = adresse;
		this.documents = documents;
	}
	
	public void afficherDocuments() {
		for (int i = 0; i <= 1; i++)
		{
			System.out.println(this.documents[i]);
		}
	}
	
	public String toString() {
		return this.nom+" au "+this.adresse+". Document(s) et/ou Article(s) : "+this.documents[1];
	}
	
	public static void main(String args[]) {
		Adresse adresse = new Adresse(2, "Avenue Jean Perrin", "Villeneuve d'Ascq", 59650);
		Document documents [] = new Document[100];
		Livre leSeigneurDesAnneaux = new Livre("Le Seigneur des Anneaux", "J.R.R Tolkien", 1954, "254d5656");
		Article articleScientifique = new Article("C'est pas sorcier n°20", "Jamy et Fred", 2010, "12de6e3p");
		
		documents[0] = leSeigneurDesAnneaux;
		documents[1] = articleScientifique;
		
		Bibliotheque b = new Bibliotheque("Lilliad", adresse, documents);
		
		b.afficherDocuments();
		System.out.println(b);
	}
}