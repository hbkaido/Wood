import java.util.Scanner;
public class exo5 {

	public static double fonction()
	{
		Scanner saisie = new Scanner(System.in);
		int x;
		System.out.println("Veuillez saisir un nombre : ");
        x = saisie.nextInt();
		System.out.println("La racine carré de " + x + " est " + Math.sqrt(x));
		saisie.close();
		return Math.sqrt(x);
	}
	
	public static void main(String[] args) {
		double result = fonction();
	}

}