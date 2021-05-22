
public class exo6 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
	    int tmp = 0;

	    System.out.format("A vaut %d et B vaut %d\n", a, b);

	    a = b;
	    b = tmp;
	    tmp = a;
	    
	    System.out.format("A vaut %d et B vaut %d\n", a, b);
	}

}
