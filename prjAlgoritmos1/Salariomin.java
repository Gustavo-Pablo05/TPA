import java.util.Scanner;
public class Salariomin {
	
	public static void main(String[] args) {
		
	
	Scanner in = new Scanner(System.in);
	int salarioUser,salarioMini;
	
	System.out.println("Entre com o seu Salário.");
	salarioUser = in.nextInt();
	System.out.println("Entre com o Salário mínimo atualmete.");
	salarioMini = in.nextInt();
	
 	if (salarioUser>salarioMini) {
 		System.out.println("Salário superior ao mínimo");
 		}else if(salarioUser==salarioMini) {
 	System.out.println("Salário igual ao mínimo permitido");
 		}else 
 		
 		{System.out.println("Salário inferior ao mínimo permitido");
 		}
	
	
}
}
