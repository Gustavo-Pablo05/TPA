package quest1;
import java.util.Scanner;
public class quest1 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		final int TAM = 10;
		int i, a[] , b[];
		  a = new int [TAM];
		  b = new int [TAM];
		
		
		for(i=0; i<TAM; i++) {
			System.out.print("Digite os valores do " + (i + 1) + " valor");
		a[i]= in.nextInt();

		}
		
		
		
	 System.out.print( "\nb[] = [");
	for(i=0; i<TAM; i++) {
		b[i] = a[i]* a[i];
		System.out.print( "  "+ b[i] );
		
	} System.out.print( "]");
}
}
