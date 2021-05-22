import java.util.Scanner;
public class exo3 {

	public static void fonction()
	{
		Scanner saisie = new Scanner(System.in);
		int x, m;
		System.out.println("Veuillez saisir un nombre : ");
        x = saisie.nextInt();
        m = x * x;
		System.out.println("Le carré de " + x + " est " + m);
		saisie.close();
	}
	
	public static void main(String[] args) {
		fonction();
	}

}