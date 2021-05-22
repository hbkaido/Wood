import java.util.Scanner;
public class exo7 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n;
		int f = 1;
		
		System.out.println("Veuillez saisir un nombre : ");
        n = saisie.nextInt();
		
		for (int i = 2; i <= n; i++)
		{
			f = f * i;
		}
			System.out.println("La factorielle de ce nombre est : " + f);
        
		saisie.close();
	}

}