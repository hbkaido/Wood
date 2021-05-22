
public class exo7 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
	    int tmp = 0;

	    System.out.format("A vaut %d, B vaut %d et C vaut %d\n", a, b, c);

	    tmp = c;
	    c = b;
	    b = a;
	    a = tmp;
	    
	    System.out.format("A vaut %d, B vaut %d et C vaut %d\n", a, b, c);
	}

}
