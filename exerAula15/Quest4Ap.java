package quest4Ap;

import java.util.Scanner;

public class Quest4Ap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAM = 10;
    	
        int[] A = new int[TAM];

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Elemento " + (i + 1) + " do vetor A: " + A[i]);
            System.out.print(" Pares de 0 até o elemento " + A[i] + ": ");
            for (int n = 0; n <= A[i]; n++) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
            System.out.println();
        }
    }
}
