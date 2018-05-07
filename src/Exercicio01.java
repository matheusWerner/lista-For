import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero que deseja saber a tabuada"));
		String texto = "";
		
		for (int i = 0; i <= 10; i++){
			 texto += "\n" + numero + " x " + i + " = " + (numero*i);
			
		}
		
		JOptionPane.showMessageDialog(null, texto);

		

		
	}

}
