public class Exercicio7 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {1, 3, 5, 7, 9},
            {2, 4, 6, 8, 0},
            {9, 8, 7, 6, 5}
        };
        int maiorSomaLinha = Integer.MIN_VALUE;
        int maiorSomaColuna = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {
            int somaLinha = 0, somaColuna = 0;
            for (int j = 0; j < 5; j++) {
                somaLinha += matriz[i][j];
                somaColuna += matriz[j][i];
            }
            if (somaLinha > maiorSomaLinha) maiorSomaLinha = somaLinha;
            if (somaColuna > maiorSomaColuna) maiorSomaColuna = somaColuna;
        }

        System.out.println("Maior soma das linhas: " + maiorSomaLinha);
        System.out.println("Maior soma das colunas: " + maiorSomaColuna);
    }
}