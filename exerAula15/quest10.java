package quest10;
import java.util.Scanner;
public class quest10 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        final int TAM = 10;
	        int[] A = new int[TAM];
	        int[] B = new int[TAM];
	        int[] C = new int[TAM];
	        int k = 0;

	        System.out.println("Digite 10 números inteiros para preencher o vetor A: ");
	        for (int i = 0; i < TAM; i++) {
	            A[i] = scanner.nextInt();
	        }

	        System.out.println("Digite 10 números inteiros para preencher o vetor B: ");
	        for (int i = 0; i < TAM; i++) {
	            B[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < TAM; i++) {
	            int j;
	            for (j = 0; j < TAM; j++) {
	                if (A[i] == B[j]) {
	                    break;
	                }
	            }
	            if (j == TAM) {
	                C[k] = A[i];
	                k++;
	            }
	        }

	        System.out.println("Vetor C (diferença dos conjuntos A e B): ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(C[i] + " ");
	        }
	    }
	}
