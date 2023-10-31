package quest11;
import java.util.Scanner;
public class quest11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		final int TAM = 10;
        int[] A = new int[TAM];

        System.out.println("Digite 10 números inteiros para preencher o vetor A: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite o elemento a ser pesquisado: ");
        int X = scanner.nextInt();

        int i = 0;
        while (i < TAM) {
            if (A[i] == X) {
                System.out.println("O elemento " + X + " está armazenado no vetor A.");
                break;
            }
            i++;
        }

        if (i == TAM) {
            System.out.println("O elemento " + X + " não está armazenado no vetor A.");
        }
    }
}
