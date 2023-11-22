package matriz;

import java.util.Scanner;

public class MatrizC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int TAML = 3;
    	final int TAMC = 4;
        int[][] matriz = new int[TAML][TAMC]; 
        
        System.out.println("Digite os valores para uma matriz de 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição linha " + (i + 1) + " coluna " + (j + 1) + ": ");
                matriz[i][j] = in.nextInt();
            }
        }
        
      
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
            }
            matriz[i][3] = soma;
        }
        
        
        System.out.println("Matriz 3x4 com a soma das linhas na última coluna:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " = ");
            }
            System.out.println();
        }
        
     
    }
}
