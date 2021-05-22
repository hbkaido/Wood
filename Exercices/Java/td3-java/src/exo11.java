import java.util.Scanner;
public class exo11 {
	
	public static void tableau () {
		Scanner input = new Scanner(System.in);
		int[] Tab;
		int Taille, Rang, Valeur;
		
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
        
		System.out.println("\nEntrez la valeur à insérer\n");
        Valeur = input.nextInt();
        System.out.println("Entrez le rang d'insertion\n");
        Rang = input.nextInt();
        if ( Rang <= Taille )
            {
            Taille = Taille + 1;
            int [] Tab2 = new int [Taille];
            for ( int i = 0 ; i <= Rang ; i++)
                {
                Tab2[i] = Tab[i];
                }
                for ( int i = Rang ; i < Tab.length ; i++ )
                    {
                    Tab2[i+1] = Tab[i];
                    }
                    Tab2[Rang] = Valeur;
                    for (int j = 0 ; j < Tab2.length ; j++)
                        {
                        System.out.println(" | "+Tab2[j] +" |");
                        }
            }
            else if ( Rang > Taille )
                    {
                    Taille = (Rang+1);
                    int [] Tab3 = new int [Taille];
                    for ( int i = 0 ; i < Tab.length ; i++ )
                        {
                        Tab3[i] = Tab[i];
                        }
                        Tab3[Rang] = Valeur;
                        for (int j = 0 ; j < Tab3.length ; j++)
                            {
                            System.out.println(" | "+Tab3[j] +" |");
                            }
                    }
        
		input.close();
		
		}
	public static void main(String[] args) {
			tableau();
	}
		
}