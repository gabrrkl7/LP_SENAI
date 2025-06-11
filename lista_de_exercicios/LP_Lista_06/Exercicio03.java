import java.util.Scanner;

public class Exercicio03 {
    public static int buscarValor(int[] vetor, int valor, int index) {
        if (index >= vetor.length) return -1;
        if (vetor[index] == valor) return index;
        return buscarValor(vetor, valor, index + 1);
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int pos = buscarValor(vetor, numero, 0);
        System.out.println(pos >= 0 ? "Valor encontrado na posição " + pos : "Valor não encontrado");
    }
}