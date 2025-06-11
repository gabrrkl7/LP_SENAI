public class Exercicio07 {
    public static int somaColuna(int[][] mat, int col, int row) {
        if (row >= mat.length) return 0;
        return mat[row][col] + somaColuna(mat, col, row + 1);
    }

    public static int somaLinha(int[][] mat, int lin, int col) {
        if (col >= mat[0].length) return 0;
        return mat[lin][col] + somaLinha(mat, lin, col + 1);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3}
        };
        int maiorSomaLinha = Integer.MIN_VALUE;
        int maiorSomaColuna = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            maiorSomaLinha = Math.max(maiorSomaLinha, somaLinha(mat, i, 0));
            maiorSomaColuna = Math.max(maiorSomaColuna, somaColuna(mat, i, 0));
        }
        System.out.println("Maior soma linha: " + maiorSomaLinha);
        System.out.println("Maior soma coluna: " + maiorSomaColuna);
    }
}