package classes;

public class Cercle {
	double rayon;
	Point point;
	
	public Cercle(double rayon, Point point) {
		this.rayon = rayon;
		this.point = point;
	}
	
	public double getRayon() {
		return rayon;
	}
	public Point getPoint() {
		return point;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public void setPoint(Point point) {
		this.point = point;
	}
}