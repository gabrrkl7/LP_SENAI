import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a distância em quilômetros: ");
        double km = scanner.nextDouble();
        double milhas = km / 1.609;
        System.out.println("Distância em milhas: " + milhas);
        scanner.close();
    }
}
