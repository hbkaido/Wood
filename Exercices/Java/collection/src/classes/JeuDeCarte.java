package classes;

import java.util.List;
import java.util.Collections;

public class JeuDeCarte{
	private List<Carte> cartes;

	public JeuDeCarte( List<Carte> cartes) {

		this.cartes = cartes;
	}
	
	public void trier() {
		Collections.sort(this.cartes);
	}

	public String toString() {
		return this.cartes.toString();
	}
}
