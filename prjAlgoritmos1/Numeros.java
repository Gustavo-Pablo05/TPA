import java.util.Scanner;
public class Numeros {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		double numero;
		
		System.out.println("Entre com um numero.");
		numero = in.nextDouble();
	
		
	 	if (numero>0) {
	 			System.out.println("Valor positivo");
	 		}else if(numero==0) {
	 			System.out.println("Valor nulo");
	 		}else {
	 		
	 			System.out.println("Valor negativo");
	 		}
		
		
	}
	}

	