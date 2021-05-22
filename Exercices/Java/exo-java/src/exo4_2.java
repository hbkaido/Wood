import java.util.Scanner;
public class exo4_2 {

	public static void main(String[] args) {
		int h, m;
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Veuillez entrer les heures : ");
		h = saisie.nextInt();
		System.out.println("Veuillez entrer les minutes : ");
		m = saisie.nextInt();
		
		m = m + 1;
		
		if (m == 60) {
			m = 0;
		    h = h + 1;
		}
		if (h == 24) {
		    h = 0;
		}
		
		System.out.println("Dans une minute il sera : " + h + " h " + m + " min" );
		saisie.close();

	}
}