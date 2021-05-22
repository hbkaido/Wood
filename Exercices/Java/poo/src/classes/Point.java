package classes;

public class Point {
	double abscisse;
	double ordonnee;
	
    public Point(double abscisse, double ordonnee) {
    	this.abscisse = abscisse;
    	this.ordonnee = ordonnee;
    }
	
	public double getAbscisse() {
		return abscisse;
	}
	public double getOrdonnee() {
		return ordonnee;
	}
	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
}