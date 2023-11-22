package matriz;

import java.util.Random;

public class MatrizB {
    public static void main(String[] args) {
    	final int TAML = 3;
    	final int TAMC = 3;
        int[][] matriz = new int[TAML][TAMC];
        Random in = new Random();

        int maiorValor = 0, menorValor = 0;
        int linhaMaior = 0, colunaMaior = 0, linhaMenor = 0, colunaMenor = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = in.nextInt(100); 

                if (i == 0 && j == 0) {
                    maiorValor = matriz[i][j];
                    menorValor = matriz[i][j];
                } else {
                    if (matriz[i][j] > maiorValor) {
                        maiorValor = matriz[i][j];
                        linhaMaior = i;
                        colunaMaior = j;
                    }
                    if (matriz[i][j] < menorValor) {
                        menorValor = matriz[i][j];
                        linhaMenor = i;
                        colunaMenor = j;
                    }
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        linhaMaior= linhaMaior +1;  colunaMaior =  colunaMaior +1;
        linhaMenor = linhaMenor +1;  colunaMenor =  colunaMenor +1;
        
        
        System.out.println("O maior numero é " + maiorValor + " linha " + linhaMaior + " coluna " + colunaMaior  );
        System.out.println("O menor numero é " + menorValor + " linha " + linhaMenor + " coluna " + colunaMenor );
    }
}