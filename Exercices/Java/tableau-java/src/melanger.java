import java.util.Scanner;

public class melanger {

	public static void tableau() {
		Scanner saisie = new Scanner(System.in);

		int[] tab;
		tab = new int[1000];
		int val = 500;
		long somme = 0;
		long moyenne = 0;

		for (int a = 0; a < 100; a++) {
			for (int i = 0; i < tab.length; i++) {
				tab[i] = i + 1;
			}

			for (int j = tab.length - 1; j >= 0; j--) {
				// hasard reçoit un nombre aléatoire entre 0 et j
				int hasard = (int) Math.floor(Math.random() * (j + 1));

				// Echange
				int sauve = tab[j];
				tab[j] = tab[hasard];
				tab[hasard] = sauve;

			}

			long start = System.nanoTime();
			for (int k = 0; k < tab.length; k++) {
				if (tab[k] == val) {
					System.out.println(val + " apparait au rang " + (k + 1));
				}

			}
			long end = System.nanoTime();

			long temps = end - start;
			somme = somme + temps;
		}
		moyenne = somme / 1000;

		double time = (double) moyenne / 1_000_000_000;
		System.out.println("\nLa moyenne d'execution du programme = " + time + " secondes");
		
		double convert = (double) somme / 1_000_000_000;
		System.out.println("\nLe temps d'execution total du programme = " + convert + " secondes");

		saisie.close();

	}

	public static void main(String[] args) {
		tableau();
	}

}