import java.util.Scanner;
public class exo1 {
	
	public static double somme () {
		Scanner saisie = new Scanner(System.in);
		
		double somme = 0;
		double [] tab = new double[5];
		
		for (int i = 0; i <= 4; i ++)
		{
			System.out.println("Veuillez entrer le réel n° " + (i + 1));
			tab[i] = saisie.nextDouble();
			somme = somme + tab[i];
		}
		
		System.out.println("La somme des elements du tableau = " + somme);
		saisie.close();
		return somme;
		
		}
	
	public static void main(String[] args) {
		somme();
	}
	
}
