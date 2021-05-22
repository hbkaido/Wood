import java.util.Scanner;
public class exo15{
	
	public static void fusion() {
		Scanner input = new Scanner(System.in);
		int[] tab;
	    int tab1[];
	    int taille, taille1;
		
		//TABLEAU1
	    
	    System.out.println("Veuillez entrer la taille du tableau : ");
		taille = input.nextInt();
		tab = new int[taille];
		
		for (int i = 0; i < tab.length; i++)
		{
			System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
			tab[i] = input.nextInt();
		}
		
		System.out.println("\n**** Votre Tableau ****\n");
		
		for (int i = 0 ; i < tab.length; i++)
		{
			System.out.println(" | " + tab[i] + " | ");
		}
		
		//TABLEAU2
		
		System.out.println("Veuillez entrer la taille du tableau 2 : ");
		taille1 = input.nextInt();
		tab1 = new int[taille1];
		
		for (int i = 0; i < tab1.length; i++)
		{
			System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
			tab1[i] = input.nextInt();
		}
		
		System.out.println("\n**** Votre Tableau 2 ****\n");
		
		for (int i = 0 ; i < tab1.length; i++)
		{
			System.out.println(" | " + tab1[i] + " | ");
		}
	    
		//TABLEAU FUSION
	    
	   int tab2[] = new int[taille + taille1];
	   
	   int pos = 0;
	    for (int i : tab) 
	    {
	      tab2[pos] = i;
	      pos++;        
	    }
	    for (int i : tab1) 
	    {
	      tab2[pos] = i;
	      pos++;
	    }
	    
	    System.out.println("\n**** Votre Tableau Fusion ****\n");
		
		for (int i = 0 ; i < tab2.length; i++)
		{
			System.out.println(" | " + tab2[i] + " | ");
		}
		
		input.close();
	}
	
	public static void main(String[] args) 
	{
		fusion();
	}
}