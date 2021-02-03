import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		String contra = "manolo";
    	Scanner teclado = new Scanner (System.in);
    	String B;
		for(int i=1;i<=3;i++) {
			System.out.println ("Introduce la contraseña:");
	    	B = teclado.next();
	    	if(contra.equals(B)) {
				System.out.println ("Enhorabuena!");
				break;
	    	}
	    	if(i<3) {
				System.out.println ("Fallo intento "+i);

	    	}else {
				System.out.println ("Fallo intento "+i+" se acabaron los intentos");
				
	    	}
			
		}
	}

}
