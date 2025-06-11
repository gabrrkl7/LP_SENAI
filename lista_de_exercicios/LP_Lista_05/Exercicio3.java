import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        int[] vetor = {3, 8, 2, 4, 9, 1, 7, 5, 0, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == num) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Valor não encontrado");
        }
        scanner.close();
    }
}