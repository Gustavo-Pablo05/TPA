import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        if (media < 3) {
            System.out.println("M�dia: " + media);
            System.out.println("Situa��o: REPROVADO");
        } else if (media >= 6) {
            System.out.println("M�dia: " + media);
            System.out.println("Situa��o: APROVADO");
        } else {
            System.out.println("M�dia: " + media);
            System.out.println("Situa��o: EXAME");
            
            System.out.print("Digite a nota de exame: ");
            double notaExame = scanner.nextDouble();
            
            double novaMedia = (media + notaExame) / 2;
            
            if (novaMedia >= 6) {
                System.out.println("Nova m�dia: " + novaMedia);
                System.out.println("Situa��o: APROVADO");
            } else {
                System.out.println("Nova m�dia: " + novaMedia);
                System.out.println("Situa��o: REPROVADO");
            }
        }
        
       
    }
}