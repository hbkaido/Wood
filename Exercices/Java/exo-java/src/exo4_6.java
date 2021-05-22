import java.util.Scanner;

public class exo4_6 {

	public static void main(String[] args) {
		double Score1, Score2, Score3, Score4, SommeScore;
        double Prcts1, Prcts2, Prcts3, Prcts4;
        
        Scanner saisie = new Scanner(System.in);
        
        System.out.println("**** Veuillez entrer les scores ****\n");
        System.out.println("Candidat n°1 : ");
	    Score1 = saisie.nextDouble();
	    System.out.println("Candidat n°2 : ");
	    Score2 = saisie.nextDouble();
	    System.out.println("Candidat n°3 : ");
	    Score3 = saisie.nextDouble();
	    System.out.println("Candidat n°4 : ");
	    Score4 = saisie.nextDouble();
	    
	    SommeScore = (Score1 + Score2 + Score3 + Score4);
	    System.out.println("Le nombre total de votants est de " + SommeScore);
	    
	    Prcts1 = (Score1 / SommeScore);
        Prcts2 = (Score2 / SommeScore);
        Prcts3 = (Score3 / SommeScore);
        Prcts4 = (Score4 / SommeScore);
        
	    System.out.println("Le candidat n°1 a reçu " + Prcts1 + " des voix.\n");
	    System.out.println("Le candidat n°2 a reçu " + Prcts2 + " des voix.\n");
	    System.out.println("Le candidat n°3 a reçu " + Prcts3 + " des voix.\n");
	    System.out.println("Le candidat n°4 a reçu " + Prcts4 + " des voix.\n");
	    
	    if (Prcts1 > 0.50) 
	    {
	    	System.out.print("Elu dès le premier tour\n");
	    } 
	    	else if (Prcts1 < 0.125) 
	    	{
	    		System.out.print("Battu dès le premier tour\n");
	    	}

	    	else if (Prcts1 > Prcts2 && Prcts1 > Prcts3 && Prcts1 > Prcts4)
	    	{
	    		System.out.print("Ballotage favorable\n");
	    	} 
	        else 
	        {
	        	System.out.print("Ballotage défavorable\n");
	        }
	    
	   saisie.close(); 
	}

}
