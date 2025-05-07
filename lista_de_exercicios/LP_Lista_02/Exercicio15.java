import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double volume = Math.PI * Math.pow(raio, 2) * altura;
        System.out.println("Volume do cilindro: " + volume);
        scanner.close();
    }
}
