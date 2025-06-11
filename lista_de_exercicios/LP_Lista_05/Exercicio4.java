import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        int maior = vetor[0], menor = vetor[0], posMaior = 0, posMenor = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i;
            }
        }
        System.out.println("Maior valor: " + maior + " na posição " + posMaior);
        System.out.println("Menor valor: " + menor + " na posição " + posMenor);
        scanner.close();
    }
}