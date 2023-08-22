import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario,irpf;

        System.out.print("Digite o salário do empregado: ");
         salario = scanner.nextDouble();

        

        if (salario <= 1434.59) {
            irpf = 0;
        } else if (salario <= 2150.0) {
            irpf = (salario * 7.5)/100 - 107.59;
        } else if (salario <= 2866.7) {
            irpf = (salario * 15.0)/100 - 268.84;
        } else if (salario <= 3582.0) {
            irpf = (salario * 22.5)/100 - 483.84;
        } else {
            irpf = (salario * 27.5)/100 - 662.94;
        }

        System.out.println("Desconto do IRPF: " + irpf);
    }
}
