import java.util.Scanner;
public class exo3 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n;
		
		System.out.println("Veuillez saisir un nombre : ");
        n = saisie.nextInt();
		
		System.out.println("Les 10 nombres suivants sont : \t");
		
		for (int i = n + 1; i <= n + 10; i++)
		{
			System.out.print(i + "\t");
		}
        
		saisie.close();
	}

}
