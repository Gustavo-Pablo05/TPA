package questAP1;
import java.util.Scanner;
public class QuestAP1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int i, a[], b[];
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor do " + (i+1) + "° Valor");
			a[i] = in.nextInt();
		
		}
		
		 System.out.print( " \nb[] = [");
			for(i=0; i<TAM; i++) {
				if( a[i]%2 == 0) {
					b[i] = a[i];
				System.out.print(" "+ b[i] );
				
			} 
}
	System.out.print( " ] numeros pares");

	System.out.print( " \na[] = [");
	for(i=0; i<TAM; i++) {
		if( a[i]%2 > 0) {
			b[i] = a[i];
		System.out.print(" "+ a[i] );
		
	} 
}
System.out.print( " ] numeros impares");
}  
	
	


	
}


