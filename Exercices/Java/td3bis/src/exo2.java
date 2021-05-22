
public class exo2 {
	
	public static void fonction1()
	{
		System.out.println("début de la fonction 1");
		fonction2();
		System.out.println("fin de la fonction 1");
	}
	
	public static void fonction2()
	{
		System.out.println("début de la fonction 2");
		fonction3();
		System.out.println("fin de la fonction 2");
	}
	
	public static void fonction3()
	{
		System.out.println("début de la fonction 3");
		System.out.println("fin de la fonction 3");
	}
	
	public static void main(String[] args) {
		System.out.println("Début de la fonction main");
		fonction1();
		System.out.println("Fin de la fonction main");
	}

}
