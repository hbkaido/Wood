import java.util.Scanner;

public class recherche {

	public static void tableau() {
		Scanner saisie = new Scanner(System.in);

		int[] tab;
		tab = new int[1000];
		int val = 900;
		long somme = 0;
		long moyenne = 0;
		int d = 0;
		int f = tab.length - 1;

		for (int a = 0; a < 100; a++) {
			d = 0;
			for (int i = 0; i < tab.length; i++) {
				tab[i] = i + 1;
			}

			long start = System.nanoTime();

			int mid = (d + f) / 2;
			while (d <= f) {
				if (tab[mid] < val) {
					d = mid + 1;
				}

				else if (tab[mid] == val) {
					System.out.println("L'élément " + val + " se trouve à l'index : " + (mid + 1));
					break;
				}

				else {
					f = mid - 1;
				}
				mid = (d + f) / 2;
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