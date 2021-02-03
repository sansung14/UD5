import javax.swing.JOptionPane;

public class ejercicio6 {

	public static void main(String[] args) {
		String A=JOptionPane.showInputDialog("Introduce el precio de un producto:");
		final double IVA=0.21;
		double total=(Double.parseDouble(A)*IVA)+Double.parseDouble(A);
		String decimales = String.format("%.2f", total);
		System.out.println("Total con IVA: "+decimales+" €");

	}

}
