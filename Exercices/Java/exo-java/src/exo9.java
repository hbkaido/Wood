import java.util.Scanner;
public class exo9 {

	public static void main(String[] args) {
		
		String chaine1;
		String chaine2;
		String conc;
		
		Scanner chaine = new Scanner(System.in);
        System.out.format("Saisir la premiere chaine : ");
        chaine1 = chaine.next();
 
        System.out.format("Saisir la deuxieme chaine : ");
        chaine2 = chaine.next();
        
        conc = chaine1 + chaine2;
 
 
        System.out.format("Apres concatenation : %s\n", conc);
        chaine.close();
	}

}