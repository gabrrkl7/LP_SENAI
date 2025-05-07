import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota 1 (peso 1): ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a nota 2 (peso 2): ");
        double n2 = scanner.nextDouble();
        double mediaPonderada = (n1 * 1 + n2 * 2) / 3;
        System.out.println("Média ponderada (0 a 10): " + mediaPonderada);
        scanner.close();
    }
}
