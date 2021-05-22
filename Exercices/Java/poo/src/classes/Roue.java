package classes;

public class Roue {
	double dimension;
	Pneu pneu;
	
	public Roue(double dimension, Pneu pneu) {
		this.dimension = dimension;
		this.pneu = pneu;
	}
	
	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	public String toString() {
		return this.pneu+" de dimension "+this.dimension;
	}
	
}
