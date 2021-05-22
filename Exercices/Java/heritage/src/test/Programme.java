package test;

import classes.personne;
import classes.employe;

public class programme {
	public static void main(String[] args)
	{
		personne p1 = new personne("Dupont", "Marc", 17);
		personne p2 = new employe("Durant", "Pierre", 28, "EDF", "Technicien");
		p1.sePresenter();
		p2.sePresenter();
	}
}
