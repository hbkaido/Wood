package test;

import classes.Articles;
import classes.Chaussure;
import classes.Orange;

public class Vente {

	public static void main(String[] args) {
		Articles a1 = new Orange(0.20);
		Articles a2 = new Chaussure(25);
		
		System.out.println(a1.calculCout(10));
		System.out.println(a2.calculCout(2));
		System.out.println(a1);
		System.out.println(a2);
	}

}