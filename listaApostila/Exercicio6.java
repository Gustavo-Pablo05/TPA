import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();

        // Ordenação crescente
        int menor, meio, maior;

        if (A <= B && A <= C) {
            menor = A;
            if (B <= C) {
                meio = B;
                maior = C;
            } else {
                meio = C;
                maior = B;
            }
        } else if (B <= A && B <= C) {
            menor = B;
            if (A <= C) {
                meio = A;
                maior = C;
            } else {
                meio = C;
                maior = A;
            }
        } else {
            menor = C;
            if (A <= B) {
                meio = A;
                maior = B;
            } else {
                meio = B;
                maior = A;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);
    }
}