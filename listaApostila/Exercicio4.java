import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        double delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("N�o existem ra�zes reais para a equa��o.");
        } else if (delta == 0) {
            double raiz = -B / (2 * A);
            System.out.println("Existe apenas uma raiz real para a equa��o: " + raiz);
        } else {
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("Existem duas ra�zes reais para a equa��o:");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
}