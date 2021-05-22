package classes;

public class Cylindre {
	double dimension;
	
	public Cylindre(double dimension) {
    	this.dimension = dimension;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}
	public String toString() {
		return this.dimension+" ";
	}
}
