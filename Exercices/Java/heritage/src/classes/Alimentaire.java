package classes;

public abstract class Alimentaire extends Articles {
	public Alimentaire(double prixUnitaire) {
		super(prixUnitaire);
	}

	public double calculCout(int n) {
		if (n >= 5) {
			return super.calculCout(n) * 0.90;
		} else {
			return super.calculCout(n);
		}
	}
}
