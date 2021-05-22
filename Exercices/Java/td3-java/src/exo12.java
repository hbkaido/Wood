import java.util.Scanner;
public class exo12 {
	
	public static void tableau () {
		Scanner input = new Scanner(System.in);
		int[] Tab;
		int Taille, Rang;
		
		System.out.println("Veuillez entrer la taille du tableau : ");
		Taille = input.nextInt();
		Tab = new int[Taille];
		
		for (int i = 0; i < Tab.length; i++)
		{
			System.out.println("Veuillez entrer l'élément numéro " + (i + 1) );
			Tab[i] = input.nextInt();
		}
		
		System.out.println("\n**** Votre Tableau ****\n");
		
		for (int i = 0 ; i < Tab.length; i++)
		{
			System.out.println(" | " + Tab[i] + " | ");
		}
        
        System.out.println("Entrez le rang à supprimer\n");
        Rang = input.nextInt();
        System.out.println("La valeur à " + Rang + " est " + Tab[Rang] + ". Cet case sera supprimé\n");
 
        int []Tab2 = new int[Taille-1];
        
        if (Rang == 0)
        {
        	for ( int i = 0 ; i < Taille -1; i++ )
        	{
        		Tab2[i] = Tab[i+1];
        	}
        	for (int j = 0 ; j < Tab2.length ; j++)
        	{
        		System.out.println(" | "+Tab2[j] +" |");
        	}
        }
        
       if (Rang == Taille-1)
        {
        	for ( int i = 0 ; i < Rang; i++ )
        	{
        		Tab2[i] = Tab[i];
        	}
        	for (int j = 0 ; j < Tab2.length ; j++)
        	{
        		System.out.println(" | "+Tab2[j] +" |");
        	}
        }
       
       if (Rang > 0 && Rang < Taille-1)
       {
    	    for ( int i = 0 ; i < Taille -1; i++ )
       		{
       			Tab2[i] = Tab[i+1];
       		}
    	    
    	    for ( int i = 0 ; i < Rang; i++ )
        	{
        		Tab2[i] = Tab[i];
        	}
    	    
    	    for (int j = 0 ; j < Tab2.length ; j++)
    	    {
    	    	System.out.println(" | "+Tab2[j] +" |");
    	    }
       }
       
		input.close();
		
		}
	public static void main(String[] args) {
			tableau();
	}
		
}