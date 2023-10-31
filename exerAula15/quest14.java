package quest14;
import java.util.Scanner;
public class quest14 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     final int TAM = 10;
     int[] A = new int[TAM];
     int[] B = new int[TAM];
     int[] C = new int[TAM];

     System.out.println("Digite 10 números para o vetor A: ");
     for (int i = 0; i < TAM; i++) {
         A[i] = scanner.nextInt();
     }

     System.out.println("Digite 10 números para o vetor B: ");
     for (int i = 0; i < TAM; i++) {
         B[i] = scanner.nextInt();
     }

     for (int i = 0; i < TAM; i++) {
         if (A[i] > B[i]) {
             C[i] = 1;
         } else if (A[i] == B[i]) {
             C[i] = 0;
         } else {
             C[i] = -1;
         }
     }

     System.out.println("Vetor C:");
     for (int i = 0; i < TAM; i++) {
         System.out.println("C[" + i + "] = " + C[i]);
     }
 }
}
