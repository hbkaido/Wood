package classes;

public class NumeroTelephone {
	private String numero;
	
	public NumeroTelephone(String numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals(Object o) { 
		if (o instanceof NumeroTelephone) {
			NumeroTelephone n = (NumeroTelephone)o;
			return this.numero.equals(n.numero); 
		}
		else {
			return false; 
		}
	}
	
	public String toString() {
		return this.numero.toString();
	}
}
