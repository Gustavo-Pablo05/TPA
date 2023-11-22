package matriz;

import java.util.Random;

public class MatrizD {
    public static void main(String[] args) {
        boolean[][] cartela = new boolean[4][4];
        int rodadas = 0;
        Random random = new Random();

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                cartela[i][j] = false;
            }
        }

       
        while (true) {
            int linha = random.nextInt(4);
            int coluna = random.nextInt(4);

            if (cartela[linha][coluna] == false) {
                int numero = random.nextInt(75) + 1;
                cartela[linha][coluna] = true;
            }

            rodadas++;
            int numeroSorteado = random.nextInt(75) + 1;
            System.out.println("Número sorteado: " + numeroSorteado);

            boolean encontrado = false;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (cartela[i][j] && ((i * 4 + j + 1) == numeroSorteado)) {
                        encontrado = true;
                        i = 4; 
                        break;
                    }
                }
            }

            boolean cartelaCompleta = true;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (cartela[i][j] == false) {
                        cartelaCompleta = false;
                        i = 4; 
                        break;
                    }
                }
            }

            System.out.println(encontrado ? "A sua cartela contém o número." : "A sua cartela não contém o número.");

            if (cartelaCompleta) {
                System.out.println("BINGO! Cartela completa em " + rodadas + " rodadas.");
                break;
            }
        }
    }
}