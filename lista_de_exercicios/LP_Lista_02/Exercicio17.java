import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double v0 = scanner.nextDouble();
        System.out.print("Digite a aceleração (em m/s²): ");
        double a = scanner.nextDouble();
        System.out.print("Digite o tempo de percurso (em segundos): ");
        double t = scanner.nextDouble();
        double v = v0 + a * t;
        System.out.println("Velocidade final do corpo: " + v + " m/s");
        scanner.close();
    }
}
