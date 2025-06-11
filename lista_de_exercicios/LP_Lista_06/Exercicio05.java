public class Exercicio05 {
    public static void copiarInvertido(int[] origem, int[] destino, int index) {
        if (index < 0) return;
        destino[origem.length - 1 - index] = origem[index];
        copiarInvertido(origem, destino, index - 1);
    }

    public static void imprimir(int[] vetor, int index) {
        if (index >= vetor.length) return;
        System.out.print(vetor[index] + " ");
        imprimir(vetor, index + 1);
    }

    public static void main(String[] args) {
        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[v1.length];
        copiarInvertido(v1, v2, v1.length - 1);
        imprimir(v1, 0);
        System.out.println();
        imprimir(v2, 0);
    }
}