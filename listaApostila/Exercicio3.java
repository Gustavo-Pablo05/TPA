import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);
        String classificacao = obterClassificacaoIMC(imc);

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String obterClassificacaoIMC(double imc) {
        if (imc < 18.5) {
            return "Excesso de Magreza";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Excesso de Peso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade (Grau I)";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade (Grau II)";
        } else {
            return "Obesidade (Grau III)";
        }
    }
}