package quest15;
import java.util.Scanner;
public class quest15 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    final int TAM = 10;
    int[] a = new int[TAM];
    int[] b = new int[TAM];
    int[] c = new int[TAM];

    System.out.println("Digite 10 números inteiros para preencher o vetor A: ");
    for (int i = 0; i < TAM; i++) {
        a[i] = scanner.nextInt();
        b[i] = a[i];
        c[i] = a[i];
    }

  
    for (int i = 0; i < TAM - 1; i++) {
        for (int j = i + 1; j < TAM; j++) {
            if (b[i] > b[j]) {
                b[i] = b[i] + b[j];
                b[j] = b[i] - b[j];
                b[i] = b[i] - b[j];
            }
        }
    }

  
    for (int i = 0; i < TAM - 1; i++) {
        for (int j = i + 1; j < TAM; j++) {
            if (c[i] < c[j]) {
                c[i] = c[i] + c[j];
                c[j] = c[i] - c[j];
                c[i] = c[i] - c[j];
            }
        }
    }

    System.out.print("Vetor B (ordem crescente): ");
    for (int i = 0; i < TAM; i++) {
        System.out.print(b[i] + " ");
    }
    System.out.println();

    System.out.print("Vetor C (ordem decrescente): ");
    for (int i = 0; i < TAM; i++) {
        System.out.print(c[i] + " ");
    }
    System.out.println();

}
}
