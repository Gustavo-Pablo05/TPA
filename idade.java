package idadess;
import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0;
        int menor= 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                maior++;
            } else {
                menor++;
            }
        }

        System.out.println("Pessoas maiores de idade: " + maior);
        System.out.println("Pessoas menores de idade: " + menor);

       
    }
}

