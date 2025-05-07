import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade em Km/h: ");
        double kmh = scanner.nextDouble();
        double ms = kmh / 3.6;
        System.out.println("Velocidade em m/s: " + ms);
        scanner.close();
    }
}
