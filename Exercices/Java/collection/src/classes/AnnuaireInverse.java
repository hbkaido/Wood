package classes;

import java.util.HashMap;
import java.util.Map;

public class AnnuaireInverse {
	private Map<NumeroTelephone, Personne> personnes;
	
	public AnnuaireInverse() {
		this.personnes = new HashMap<NumeroTelephone, Personne>();
	}
	
	public void ajouter(NumeroTelephone NumeroTelephone, Personne Personne) {
		this.personnes.put(NumeroTelephone, Personne);
	}
	
	 public void supprimer(NumeroTelephone NumeroTelephone) {
		 this.personnes.remove(NumeroTelephone);
	}
	
	public String toString() {
		 return this.personnes.toString();
	}
	 public Personne chercher(NumeroTelephone NumeroTelephone) {
		 return this.personnes.get(NumeroTelephone);
	}
}