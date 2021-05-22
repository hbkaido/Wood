package test;

import classes.Bicyclette;

public class Application5 {

	public static void main(String[] args) {
		Bicyclette b1 = new Bicyclette("Noir", "Droite", 6, 1, 0);
		
		System.out.println(b1);
		b1.accelerer(50);
		b1.tourner("Gauche");
		System.out.println(b1);
	}

}