import java.util.Scanner;
public class exo8_9 {

	public static void main(String[] args) {
		Scanner saisie = new Scanner(System.in);
		int n = 1;
		int i = 0;
		int pg = 0;
		int ppg = 0;
		
		 while (n!= 0)
		    {
			 	System.out.println("Veuillez saisir un nombre : ");
		        n = saisie.nextInt();
		        i = i + 1;

		        if (i==1 || n > pg)
		        {
		            pg = n;
		            ppg = i;
		        }
		    }
		 System.out.println("Le nombre le plus grand est : " + pg);
		 System.out.println("Position numero : " + ppg);
		
		saisie.close();
	}

}