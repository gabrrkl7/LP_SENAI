import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Linhas da primeira matriz: ");
        int l1 = sc.nextInt();
        System.out.print("Colunas da primeira matriz: ");
        int c1 = sc.nextInt();
        System.out.print("Linhas da segunda matriz: ");
        int l2 = sc.nextInt();
        System.out.print("Colunas da segunda matriz: ");
        int c2 = sc.nextInt();

        if (c1 != l2) {
            System.out.println("Multiplicação impossível.");
            return;
        }

        int[][] A = new int[l1][c1];
        int[][] B = new int[l2][c2];
        int[][] C = new int[l1][c2];

        System.out.println("Valores da primeira matriz:");
        for (int i = 0; i < l1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Valores da segunda matriz:");
        for (int i = 0; i < l2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();

        for (int i = 0; i < l1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("Matriz produto:");
        for (int[] linha : C) {
            for (int v : linha)
                System.out.print(v + " ");
            System.out.println();
        }
    }
}