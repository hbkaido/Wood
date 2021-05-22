package classes;

public class Carte implements Comparable<Carte>{
	private Integer numero;
	private String couleur;
	
	public Carte(String couleur, int numero) {
		this.couleur = couleur;
		this.numero = numero;
	}
	
	public String toString() {
		return "Le " +this.numero+" de "+this.couleur;
	}
	
	@Override
	public int compareTo(Carte t) {
		if ( this.numero == t.numero) {
			return 0;
		}else if ( this.numero < t.numero  ) {
			return -1;
		}else {
			return 1;
		}
	}
}
