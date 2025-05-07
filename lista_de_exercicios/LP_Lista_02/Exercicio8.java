import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em polegadas: ");
        double polegadas = scanner.nextDouble();
        double mm = polegadas * 25.4;
        System.out.println("Valor em milímetros: " + mm);
        scanner.close();
    }
}
