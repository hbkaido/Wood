import java.util.Scanner;

public class exo4_3 {

	public static void main(String[] args) {
		int h, m, s;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer les heures : ");
		h = saisie.nextInt();
		System.out.println("Veuillez entrer les minutes : ");
		m = saisie.nextInt();
		System.out.println("Veuillez entrer les secondes : ");
		s = saisie.nextInt();
		
		s = s + 1;
		
		if (s >= 59) 
		{
		    s = 0;
		    m = m + 1;
		}
		
		if (m >= 60) 
		{
		    m = 0;
		    h = h + 1;
		}
		
		if (h >= 24 ) 
		{
		    h = 0;
	    }
		
		System.out.println("Dans une seconde il sera : " + h + " h " + m + " min " + s + " sec ");
		saisie.close();
	}

}
