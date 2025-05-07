import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cone: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        double volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;
        System.out.println("Volume do cone: " + volume);
        scanner.close();
    }
}
