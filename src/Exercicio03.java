import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 20"));
		

		
		for(int i = 0; i < numero; i++){
			
			System.out.println("");
			
			for(int j = 0; j < numero; j++){
				
				System.out.print("*"); 
				
			}
		}
		
        
		
		
				
		

	}

}
