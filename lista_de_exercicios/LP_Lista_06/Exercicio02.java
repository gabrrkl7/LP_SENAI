public class Exercicio02 {
    public static void modificarVetor(int[] vetor, int index) {
        if (index >= vetor.length) return;
        vetor[index] = (index % 2 == 0) ? vetor[index] + 2 : vetor[index] * 2;
        modificarVetor(vetor, index + 1);
    }

    public static void imprimir(int[] vetor, int index) {
        if (index >= vetor.length) return;
        System.out.print(vetor[index] + " ");
        imprimir(vetor, index + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        modificarVetor(vetor, 0);
        imprimir(vetor, 0);
    }
}