
public class Exercicio5 {

	public static void main(String[] args) {
		
		String texto = "";
		
		for(int l = 00; l <= 3; l++){
			for(int i = 00; i <= 59; i++){
				for(int j = 00; j <= 59; j++){
					
					if (l < 10){
					texto = "0";
					}
					
					texto += l;
					
					
					
					
					System.out.println(texto + " : " + i + " : " + j);
					texto = "";
					
					
				
				}
			}
		}
				
		
		
		

	}

}
