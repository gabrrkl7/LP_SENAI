public class Exercicio10 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int[][] B = {
            {7, 8},
            {9, 10}
        };
        int[][] C = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        for (int[] linha : C) {
            for (int elem : linha) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}