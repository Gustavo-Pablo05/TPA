import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do lado A: ");
        int a = scanner.nextInt();

        System.out.println("Digite o valor do lado B: ");
        int b = scanner.nextInt();

        System.out.println("Digite o valor do lado C: ");
        int c = scanner.nextInt();

        if (formaTriangulo(a, b, c)) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Triângulo Escaleno");
            } else {
                System.out.println("Triângulo Isósceles");
            }
        } else {
            System.out.println("As medidas não formam um triângulo.");
        }
    }

    public static boolean formaTriangulo(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
