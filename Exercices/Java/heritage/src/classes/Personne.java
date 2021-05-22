package classes;

public class personne {
	String nom;
	String prenom;
	int age;
	
	public personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void sePresenter() {
		System.out.println("Bonjour je m'appelle " +this.nom+ " "+this.prenom+", j'ai " +this.age+" ans");
	}
}
