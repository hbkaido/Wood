package classes;

public class Pneu {
	String marque;
	double pression;

	public Pneu(String marque, double pression) {
    	this.marque = marque;
    	this.pression = pression;
	}	
	
    public String getMarque() {
    	return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPression() {
		return pression;
	}

	public void setPression(double pression) {
		this.pression = pression;
	}
	public String toString() {
		return this.marque+" de pression "+this.pression;
	}
}