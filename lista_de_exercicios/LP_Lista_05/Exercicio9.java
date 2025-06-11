public class Exercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {1, 3, 5, 7, 9},
            {2, 4, 6, 8, 0},
            {9, 8, 7, 6, 5}
        };
        for (int i = 0; i < 5; i++) {
            System.out.print(matriz[i][4 - i] + " ");
        }
    }
}