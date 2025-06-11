import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Linhas da matriz A: ");
        int l1 = scanner.nextInt();
        System.out.print("Colunas da matriz A / Linhas da matriz B: ");
        int c1l2 = scanner.nextInt();
        System.out.print("Colunas da matriz B: ");
        int c2 = scanner.nextInt();

        int[][] a = new int[l1][c1l2];
        int[][] b = new int[c1l2][c2];
        int[][] produto = new int[l1][c2];

        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < l1; i++)
            for (int j = 0; j < c1l2; j++)
                a[i][j] = scanner.nextInt();

        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < c1l2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = scanner.nextInt();

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1l2; k++) {
                    produto[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matriz Produto:");
        for (int[] linha : produto) {
            for (int val : linha) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}