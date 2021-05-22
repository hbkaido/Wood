package classes;

public class employe extends personne {
	String employeur;
	String posteOccupe;
	
	public void sePresenter() {
		super.sePresenter();
		System.out.println("De plus je travaille chez " +this.employeur+ " en tant que "+this.posteOccupe);
	}
	
	public employe(String nom, String prenom, int age, String employeur, String posteOccupe) {
		super(nom, prenom, age);
		this.employeur = employeur;
		this.posteOccupe = posteOccupe;
	}
}
