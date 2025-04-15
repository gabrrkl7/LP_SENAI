import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = scanner.nextInt();

        int inicio = Math.min(a, b) + 1;
        int fim = Math.max(a, b);

        System.out.println("Números naturais entre eles:");
        for (int i = inicio; i < fim; i++) {
            System.out.println(i);
        }
    }
}
