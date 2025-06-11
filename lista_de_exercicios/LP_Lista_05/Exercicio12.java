public class Exercicio12 {
    public static void main(String[] args) {
        int[][] m = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };
        int determinante = 
            m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
          - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
          + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        System.out.println("Determinante: " + determinante);
    }
}