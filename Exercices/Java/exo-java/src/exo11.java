import java.util.Scanner;
public class exo11 {
	
	public static void main(String[] args) {
		
		float n, c;
		
		Scanner carre = new Scanner(System.in);
		
        System.out.print("Entrez un nombre : ");
        n = carre.nextFloat();
 
        c = n * n;
        System.out.printf("\n\nLe carré de ce nombre est : %f\n", c);
        carre.close();
	}

}
