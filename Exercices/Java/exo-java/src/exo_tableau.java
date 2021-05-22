import java.util.Scanner;
public class exo_tableau {

	public static void main(String[] args) {
		
		int taille, i, x, j;
		int[] tab;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = scanner.nextInt();
		tab = new int[taille];
		
		for (i = 0; i < tab.length; i = i + 1)
		{
			System.out.println("Veuillez entrer la valeur n° " + (i + 1));
			tab[i] = scanner.nextInt();
		}
		
	
		//avant tri
		System.out.print("[ ");
		for (j = 0 ; j < tab.length - 1 ; j++)
		{
			System.out.print(tab[j] + ", ");
		}
		
		System.out.println(tab[tab.length - 1]+" ]");
		
		//tri
		for (i = 1; i < tab.length; i++) 
		{
			x = tab[i];
			j = i;
			while ((j >= 1) && (tab[j - 1] > x)) {
				tab[j]  = tab[j - 1] ;
				j = j - 1;
			}
			tab[j] = x;
		}
		
		//apres tri
		System.out.print("[ ");
		for (j = 0 ; j < tab.length - 1 ; j++)
		{
			System.out.print(tab[j] + ", ");
		}
		
		System.out.println(tab[tab.length - 1]+" ]");
		
		scanner.close();

	}
	
}