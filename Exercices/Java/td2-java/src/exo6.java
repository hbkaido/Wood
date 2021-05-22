import java.util.Scanner;
public class exo6 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n;
		int s = 0;
		
		System.out.println("Veuillez saisir un nombre : ");
        n = saisie.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			s = s + i;
		}
			System.out.println("La somme des entiers jusque " + n + " est : " + s);
        
		saisie.close();
	}

}