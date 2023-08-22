import java.util.Scanner;
public class Fahrenheit {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		double temFah,temCel;
		
		System.out.println("insira a temperatura em fahrenheit");
		temFah = in.nextDouble();
		
	    temCel = (temFah-32)/1.8;
	    
	    if (temCel<15) {
	 		System.out.println("tempo frio");
	 		}else if(temCel >= 22) {
	 	System.out.println("clima quente");
	 		}else
	 		
	 		{System.out.println("Tempo ameno");
	 		}
		
	   	}

}
