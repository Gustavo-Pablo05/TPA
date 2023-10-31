package quest9Ap;

import java.util.Scanner;

public class Quest9Ap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int TAM = 10;
        int[] A = new int[TAM];
        int[] B = new int[TAM];
        int[] C = new int[TAM];
        int k = 0;

        System.out.println("Digite 10 valores inteiros para o conjunto A: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = in.nextInt();
        }

        System.out.println("Digite 10 valores inteiros para o conjunto B: ");
        for (int i = 0; i < TAM; i++) {
            B[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (A[i] == B[j]) {
                    C[k] = A[i];
                    k++;
                    break;
                }
            }
        }

        System.out.println(" a interseção dos conjuntos A e B é: ");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
