package quest6Ap;

import java.util.Scanner;

public class Quest6Ap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[11];

        System.out.println("Digite 11 números para usar como expoente de 2 ");
        for (int i = 0; i < 11; i++) {
            System.out.print("Digite o " +(i + 1) + " valor : ");
            A[i] = scanner.nextInt();
        }

        System.out.println("resultados :");
        for (int i = 0; i < 11; i++) {
            int r = 1;
            for (int j = 0; j < A[i]; j++) {
                r *= 2;
            }
            System.out.println("2 com expoente " + (i + 1) + "] = " + r);
        }
    }
}
