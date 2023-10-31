package quest12;
import java.util.Scanner;
public class quest12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TAM = 10;
        int[] A = new int[TAM];

        System.out.println("Digite 10 números inteiros para preencher o vetor A: ");
        for (int i = 0; i < TAM; i++) {
            A[i] = scanner.nextInt();
        }

        int i = 0;
        while (i < TAM / 2 && A[i] == A[TAM - 1 - i]) {
            i++;
        }

        if (i == TAM / 2) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor não é um palíndromo.");
        }
    }
}





	    

	    