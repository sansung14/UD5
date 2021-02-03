import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		int A= 7;
		int B= 5;
		System.out.println ("Introduce un valor:");
	    Scanner teclado = new Scanner (System.in);
	    A = teclado.nextInt();
	    System.out.println ("Introduce otro valor:");
	    B = teclado.nextInt();
	    if(A==B)
	    	System.out.println("El valor "+A+" es igual que "+B);
	    else if(A>B)
	    	System.out.println("El valor "+A+" es mas grande que "+B);
		else
			System.out.println("El valor "+B+" es mas grande que "+A);
	}

}
