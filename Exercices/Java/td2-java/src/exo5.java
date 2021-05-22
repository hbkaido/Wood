import java.util.Scanner;
public class exo5 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n;
		
		System.out.println("Veuillez saisir un nombre : ");
        n = saisie.nextInt();
		
		System.out.println("La table de multiplication jusque 10 de " + n + " est : \n");
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.print(n + " * " + i + " = " + i * n + "\n");
		}
        
		saisie.close();
	}

}
