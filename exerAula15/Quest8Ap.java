package quest8Ap;

import java.util.Scanner;

public class Quest8Ap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];

        System.out.println("Digite 10 valores inteiros para preencher o vetor A: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            B[i] = 0;
            for (int j = i; j < TAM; j++) {
                B[i] += A[j];
            }
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < TAM; i++) {
            System.out.println("valor " + (i + 1) + " = " + B[i]);
        }
    }
}
