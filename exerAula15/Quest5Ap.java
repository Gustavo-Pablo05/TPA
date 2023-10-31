package quest5Ap;

import java.util.Scanner;

public class Quest5Ap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAM = 10;
    	int[] A = new int[TAM];
        
        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("valor " + (i + 1) + " do vetor divide por " );
        
            for (int n = 1; n <= A[i]; n++) {
                if (A[i] % n == 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
