import java.util.Scanner;
public class exo12 {

	public static void main(String[] args) {
		
		int na = 0;
	    float ht = 0;
	    float ttc = 0;
	    float tva = 0;
	    
	    Scanner prix = new Scanner(System.in);
	    
        System.out.print("Entrez le nombre d'article: ");
        na = prix.nextInt();
        
        System.out.print("Entrez le prix HT: ");
        ht = prix.nextFloat();
        
        System.out.print("Entrez la TVA: ");
        tva = prix.nextFloat();
        
        prix.close();
        
        ttc = na * ht * (1 + tva);
        
        System.out.printf("Le prix TTC est de %f ", ttc);
 
	}

}
