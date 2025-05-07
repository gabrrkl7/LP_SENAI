import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade em m/s: ");
        double ms = scanner.nextDouble();
        double kmh = ms * 3.6;
        System.out.println("Velocidade em Km/h: " + kmh);
        scanner.close();
    }
}
