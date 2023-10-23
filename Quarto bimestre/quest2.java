package quest2;
import java.util.Scanner;
public class quest2 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[], c[];
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		
		
		for(i=0; i<TAM; i++){
			System.out.println("Digite os valores do " + (i+1) + " valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0; i<TAM; i++){
			System.out.println("Digite os valores do " + (i+1) + " valor de B");
			b[i] = in.nextInt();
		}
		
		
		System.out.print("\nc[] = [");
		for(i=0; i<TAM; i++) {
		c[i] = a[i] + b[i]; 
		System.out.print(" " + c[i] );
		}
		
		System.out.print("]");
		
	}

}
