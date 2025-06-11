public class Exercicio06 {
    public static void inverter(int[] vetor, int i, int j) {
        if (i >= j) return;
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
        inverter(vetor, i + 1, j - 1);
    }

    public static void imprimir(int[] vetor, int index) {
        if (index >= vetor.length) return;
        System.out.print(vetor[index] + " ");
        imprimir(vetor, index + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        inverter(vetor, 0, vetor.length - 1);
        imprimir(vetor, 0);
    }
}