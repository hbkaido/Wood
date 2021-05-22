import java.util.Scanner;

public class exo4_4 {

	public static void main(String[] args) {
		int nmbr;
		float  prix;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le nombre de photocopies : ");
		nmbr = saisie.nextInt();
		
		if (nmbr <= 10) 
		{
			prix = nmbr * 0.1f;
	    } 
		
		else if (nmbr <= 30)
	    {
	    	prix = ((nmbr - 10) * 0.09f) + (10 * 0.1f);
	    } 
	    
	    else 
	    {
	    	prix = ((nmbr - 30 ) * 0.08f) + (20 * 0.09f) + (10 * 0.1f);
	    }
		
		System.out.println("Le prix est de : " + prix );
		saisie.close();

	}

}
