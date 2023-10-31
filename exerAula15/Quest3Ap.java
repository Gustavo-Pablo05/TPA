package quets3Ap;

import java.util.Scanner;

public class Quest3Ap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
    	
        int[] A = new int[TAM];

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            int n;
            for (n = 2; n <= A[i] / 2; n++) {
                if (A[i] % n == 0) {
                    break;
                }
            }
            if (n > A[i] / 2 && A[i] > 1) {
                System.out.println(A[i] + " é um número primo.");
            } else {
                System.out.println(A[i] + " não é um número primo.");
            }
        }
    }
}
