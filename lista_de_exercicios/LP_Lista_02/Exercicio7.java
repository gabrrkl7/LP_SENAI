import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor em milímetros: ");
        double mm = scanner.nextDouble();
        double polegadas = mm / 25.4;
        System.out.println("Valor em polegadas: " + polegadas);
        scanner.close();
    }
}
