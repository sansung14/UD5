import javax.swing.JOptionPane;

public class ejercicio4 {

	public static void main(String[] args) {
		String radio=JOptionPane.showInputDialog("Introduce el radio del circulo:");
		double area = Math.PI*Math.pow(Double.parseDouble(radio), 2);
		System.out.println("El area del circulo es: "+area);

	}

}
