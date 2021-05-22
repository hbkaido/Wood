import java.util.Scanner;
public class exo4 {

	public static void fonction()
	{
		Scanner saisie = new Scanner(System.in);
		int x;
		System.out.println("Veuillez saisir un nombre : ");
        x = saisie.nextInt();
		System.out.println("La racine carré de " + x + " est " + Math.sqrt(x));
		saisie.close();
	}
	
	public static void main(String[] args) {
		fonction();
	}

}