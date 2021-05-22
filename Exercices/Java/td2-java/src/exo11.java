import java.util.Scanner;
public class exo11 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n, p;
		int f = 1;
		int f2 = 1;
		int f3 = 1;
		int x, y;
		
		System.out.println("Veuillez saisir le nombre de chevaux partants : ");
        n = saisie.nextInt();
        System.out.println("Veuillez saisir le nombre de chevaux joués : ");
        p = saisie.nextInt();
		
		for (int i = 2; i <= n; i++)
		{
			f = f * i;
		}
			
		for (int i = 2; i <= p; i++)
		{
			f2 = f2 * i;
		}
		
		for (int i = 2; i <= (n - p); i++)
		{
			f3 = f3 * i;
		}
		
		x = f / f3;
		y = f / (f2 * f3);
		
		System.out.println("Dans l'ordre : une chance sur " + x + " de gagner");
		System.out.println("Dans le désordre : une chance sur " + y + " de gagner");
        
		saisie.close();
	}

}