package test;

import java.util.ArrayList;
import java.util.List;

import classes.Carte;
import classes.JeuDeCarte;

public class Programme {
	public static void main(String[] args) {
		
		List<Carte> cartes = new ArrayList<Carte>();
		cartes.add( new Carte("Trèfle", 1) );
		cartes.add( new Carte("Coeur", 8) );
		cartes.add( new Carte("Trèfle", 5) );
		cartes.add( new Carte("Carreau", 13) );
		cartes.add( new Carte("Pique", 7) );
		
		JeuDeCarte jeu = new JeuDeCarte(cartes);
		System.out.println("Affichage avant le tri :");
		System.out.println(jeu);
		jeu.trier();
		System.out.println("Affichage après le tri :");
		System.out.println(jeu);
	}
}
