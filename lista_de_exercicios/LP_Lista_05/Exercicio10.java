public class Exercicio10 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        int[][] b = {
            {7, 8},
            {9, 10}
        };
        int[][] produto = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }

        for (int[] linha : produto) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}