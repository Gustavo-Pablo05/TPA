package quest3;
import java.util.Scanner;
public class quest3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i, a[] , b[];
		a= new int [TAM];
		b= new int [TAM];
		
		for(i=0; i<TAM; i++){
			System.out.println("Digite os valores do " + (i+1) + " valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			b[i] = a[9 -i];
		}
		
		System.out.print( "\na[] = [");
		for(i=0; i<TAM; i++) {
			
			System.out.print( "  "+ a[i] );
			
		} System.out.print( "]");
		
		System.out.print( "\nb[] = [");
		for(i=0; i<TAM; i++) {
			
			System.out.print( "  "+ b[i] );
			
		} System.out.print( "]");
	}

}
