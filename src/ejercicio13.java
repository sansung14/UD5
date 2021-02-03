import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		int A;
		int B;
		String signo;
		System.out.println ("Introduce un valor:");
	    Scanner teclado = new Scanner (System.in);
	    A = teclado.nextInt();
	    System.out.println ("Introduce el segundo valor:");
	    B = teclado.nextInt();
	    System.out.println ("Introduce el signo aritmetico a calcular:");
	    signo = teclado.next();
	    switch (signo) {
		  case "+":
			  System.out.println("Resultado de: "+A+"+"+B+" = "+(A+B));
			  break;
		  case "-":
			  System.out.println("Resultado de: "+A+"-"+B+" = "+(A-B));
			  break;
		  case "*":
			  System.out.println("Resultado de: "+A+"*"+B+" = "+(A*B));
			  break;
		  case "/":
			  double A1=A;
			  double B1=B;
			  System.out.println("Resultado de: "+A+"/"+B+" = "+(A1/B1));
			  break;
		  case "^":
			  System.out.println("Resultado de: "+A+"^"+B+" = "+(Math.pow(A, B)));
			  break;
		  case "%":
			  System.out.println("Resultado de: "+A+"%"+B+" = "+(A%B));
			  break;
	    }
	}

}
