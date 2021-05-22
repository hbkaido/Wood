package test;

import classes.Article;

public class Application4 {

	public static void main(String[] args) {
		Article a1 = new Article(1, "Nike", 90, 25);
		Article a2 = new Article(1, "Nike", 90, 25);
		System.out.println("Le prix TTC de " + a1 + " est de " + a1.calculPrixTTC() + " euro.");
		
		if( a1.equals(a2) ) {
			System.out.println("Elle sont égales");
		}else {
			System.out.println("Elles sont différentes");
		}
	}
	
}