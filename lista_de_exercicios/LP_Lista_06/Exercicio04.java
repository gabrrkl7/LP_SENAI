import java.util.Scanner;

public class Exercicio04 {
    public static void lerVetor(int[] vetor, int index, Scanner sc) {
        if (index >= vetor.length) return;
        System.out.print("Digite o valor da posição " + index + ": ");
        vetor[index] = sc.nextInt();
        lerVetor(vetor, index + 1, sc);
    }

    public static void encontrarMaiorMenor(int[] vetor, int index, int maior, int menor, int posMaior, int posMenor) {
        if (index >= vetor.length) {
            System.out.println("Maior: " + maior + " na posição " + posMaior);
            System.out.println("Menor: " + menor + " na posição " + posMenor);
            return;
        }
        if (vetor[index] > maior) {
            maior = vetor[index];
            posMaior = index;
        }
        if (vetor[index] < menor) {
            menor = vetor[index];
            posMenor = index;
        }
        encontrarMaiorMenor(vetor, index + 1, maior, menor, posMaior, posMenor);
    }

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        lerVetor(vetor, 0, sc);
        encontrarMaiorMenor(vetor, 0, vetor[0], vetor[0], 0, 0);
    }
}