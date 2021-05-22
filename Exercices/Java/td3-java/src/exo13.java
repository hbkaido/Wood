import java.util.Scanner;
public class exo13 {
	
	public static void tableau () {
		Scanner input = new Scanner(System.in);
		int[] Tab;
		int temp, Taille, i, j;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		Taille = input.nextInt();
		Tab = new int[Taille];
		
		for (i = 0; i < Tab.length; i++)
		{
			System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
			Tab[i] = input.nextInt();
		}
		
		System.out.println("\n**** Votre Tableau ****\n");
		
		for (i = 0 ; i < Tab.length; i++)
		{
			System.out.println(" | " + Tab[i] + " | ");
		}
		
		for (i = 0; i < Tab.length; i++)
		{
			for (j = i + 1; j < Tab.length; j++)
			{
				if ( Tab[j] < Tab[i] )
				{
					temp = Tab[i];
					Tab[i] = Tab[j];
					Tab[j] = temp;
				}
			}
		}
		
		System.out.println("\n**** Votre Tableau Après Le Tri ****\n");
		
		for (i = 0 ; i < Tab.length; i++)
		{
			System.out.println(" | " + Tab[i] + " | ");
		}
		
		input.close();
		
	}
	
public static void main(String[] args) {
		tableau();
	}
	
}