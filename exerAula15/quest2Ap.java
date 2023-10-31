package quest2Ap;
import java.util.Scanner;

public class quest2Ap {
    public static void main(String[] args) {
    	final int TAM = 5;
    	
        int[] A = new int[TAM];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores para a tabuada:");

        for (int i = 0; i < TAM; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.println("Tabuada de " + A[i] + ":");
            for (int t = 1; t <= 10; t++) {
                System.out.println(A[i] + " x " + t + " = " + (A[i] * t));
            }
            System.out.println();
        }
    }
}
