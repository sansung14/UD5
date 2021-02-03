import javax.swing.JOptionPane;

public class ejercicio10 {

	public static void main(String[] args) {
		String A=JOptionPane.showInputDialog("Introduce el numero de ventas:");
		String venta = "0";
		double total=0;
		for(int i=1;i<=Double.parseDouble(A);i++) {
			venta=JOptionPane.showInputDialog("Introduce la venta "+i+":");
			total=total+(Double.parseDouble(venta));
		}
		System.out.println("Total de las ventas: "+total+" €");

	}

}
