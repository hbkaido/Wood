import java.util.Scanner;
public class exo14 {
	
	public static void tableau () {
		Scanner input = new Scanner(System.in);
		int[] Tab;
		int temp, Taille, i, j, posmax;
		
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
		
		for (i = 0; i < Tab.length ; i++)						
		{
			posmax = i;
			for (j = i + 1; j < Tab.length; j++)
			{
				if ( Tab[j] > Tab[posmax] )
				{
					posmax = j;
				}
			}
			temp = Tab[posmax];
			Tab[posmax] = Tab[i];
			Tab[i] = temp;
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