public class Exercicio08 {
    public static void exibirDiagonalPrincipal(int[][] mat, int i) {
        if (i >= mat.length) return;
        System.out.print(mat[i][i] + " ");
        exibirDiagonalPrincipal(mat, i + 1);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        exibirDiagonalPrincipal(mat, 0);
    }
}