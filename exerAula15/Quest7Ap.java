package quest7Ap;

import java.util.Scanner;

public class Quest7Ap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 15;
        long[] A = new long[TAM];
        long[] B = new long[TAM];

        System.out.println("Digite 15 números inteiros para preencher o vetor A: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextLong();
        }

        System.out.println("Vetor B (fatoriais): ");
        for (int i = 0; i < TAM; i++) {
            B[i] = 1;
            for (int n = 2; n <= A[i]; n++) {
                B[i] *= n;
            }
            System.out.println("B[" + (i + 1) + "] = " + B[i]);
        }
    }
}
