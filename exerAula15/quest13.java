package quest13;
import java.util.Scanner;
public class quest13 {
	
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        final int TAM = 10;
	        int[] a = new int[TAM];
	        int[] b = new int[TAM];

	        System.out.println("Digite 10 números para o vetor A: ");
	        for (int i = 0; i < TAM; i++) {
	            a[i] = in.nextInt();
	            if (a[i] % 2 == 0) {
	                b[i] = 0;
	            } else {
	                b[i] = 1;
	            }
	        }

	        System.out.println("Vetor B:");
	        for (int i = 0; i < TAM; i++) {
	            System.out.println("B[" + i + "] = " + b[i]);
	        }
	    }
	}
