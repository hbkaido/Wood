import java.util.Scanner;
public class exo10 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		int[] tab;
		int taille, val, valmod, i;
		int rang;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		taille = saisie.nextInt();
		tab = new int[taille];
		
			for (i = 0; i < tab.length; i++)
			{
				System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
				tab[i] = saisie.nextInt();
			}
			
			System.out.println("\n**** Votre Tableau ****\n");
			
			for (i = 0 ; i < tab.length; i++)
			{
				System.out.println(" | " + tab[i] + " | ");
			}
			
			
		System.out.println("Quel valeur du tableau voulez vous modifier ?");
	    val = saisie.nextInt();
	 
	    for(int j = 0 ; j < tab.length; j++)
		{
	    	 if(tab[j]==val)
			 {
	    		 System.out.println( val + " se trouve à l'emplacement " + j + " dans le tableau\n");
			 }
		}
	    System.out.println("Tapez la nouvelle valeur :");  
		valmod = saisie.nextInt();
		System.out.println("Tapez le rang :");
		rang = saisie.nextInt();
		if (rang > taille)
   	 	{
   		 System.out.println( rang + " est superieur a la taille de votre tableau\n");
   		 	System.exit(0);

   	 	}
		tab[rang] = valmod;
		
	    System.out.println("\n**** Votre Nouveau Tableau ****\n");
			
		for (i = 0 ; i < tab.length; i++)
		{
			System.out.println(" | " + tab[i] + " | ");
		}
			
			
		saisie.close();
		
		}
	
	public static void main(String[] args) {
		tableau();
	}
	
}