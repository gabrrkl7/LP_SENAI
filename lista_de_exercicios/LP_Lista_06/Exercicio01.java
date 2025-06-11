public class Exercicio01 {
    public static void imprimirReverso(int[] vetor, int index) {
        if (index < 0) return;
        System.out.print(vetor[index] + " ");
        imprimirReverso(vetor, index - 1);
    }

    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        imprimirReverso(vetor, vetor.length - 1);
    }
}