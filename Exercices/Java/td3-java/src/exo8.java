import java.util.Scanner;
public class exo8 {
	
	public static void tableau () {
		Scanner saisie = new Scanner(System.in);
		
		 	int [] tab;
	        int [] count = new int[100];
	        int taille;
	        
	    	System.out.println("Veuillez entrer la taille du tableau : ");
			taille = saisie.nextInt();
			tab = new int[taille];
			
	        int i,tmp = 0;
	        
	        for(i = 0; i < tab.length; i++)
	        {
	        	System.out.println("Veuillez entrer l'élément numéro " + (i + 1));
				tab[i] = saisie.nextInt();
	            tmp = tab[i];
	            count[tmp]++;
	        }
	        
	        for(i = 1; i < count.length; i++)
	        {
	            if(count[i] > 0 && count[i] == 1)
	            {
	            	System.out.printf("%d se produit %d fois\n",i, count[i]);
	            }
	            else if(count[i] >= 2)
	            {
	                System.out.printf("%d se produit %d fois\n",i, count[i]);
	            }
	         }
	        
	        saisie.close();
	}
	
	public static void main(String[] args) {
		tableau();
	}
	
}