package classes;

public class Article {
	int noArticle;
	String designation;
	double prixHT;
	double tauxTVA;

	public Article(int noArticle, String designation, double prixHT, double tauxTVA) {
		this.noArticle = noArticle;
		this.designation = designation;
		this.prixHT = prixHT;
		this.tauxTVA = tauxTVA;
	}
	
	public String toString() {
		return this.designation+" à "+this.prixHT+" euro avec une TVA de "+this.tauxTVA+"%";
	}

	public boolean equals(Article a) {
		if (this.designation == a.designation && this.noArticle == a.noArticle && this.prixHT == a.prixHT && this.tauxTVA == a.tauxTVA) {
			return true;
		}
		return false;
	}
	
	public double calculPrixTTC() {
		return this.prixHT + (this.prixHT * this.tauxTVA / 100);
	}
}
