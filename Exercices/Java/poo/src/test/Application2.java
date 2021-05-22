package test;

import classes.Cercle;
import classes.Point;

public class Application2 {

	public static void main(String[] args) {
		Point p1 = new Point(2,2);
		Cercle c1 = new Cercle(5, p1);
		System.out.println("Un cercle de centre ("+c1.getPoint().getAbscisse()+", "+c1.getPoint().getOrdonnee()+") et de rayon "+c1.getRayon());
	}

}
