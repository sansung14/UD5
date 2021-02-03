import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		String A=JOptionPane.showInputDialog("Introduce un numero:");
		if((Double.parseDouble(A)%2)==0)	
			System.out.println(A+" es divisible");
		else
			System.out.println(A+" no es divisible");

	}

}
