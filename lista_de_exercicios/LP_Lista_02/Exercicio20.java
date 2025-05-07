import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a raiz x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite a raiz x2: ");
        double x2 = scanner.nextDouble();
        
        double a = 1;
        double b = -(x1 + x2);
        double c = x1 * x2;
        
        System.out.println("A equação do 2º grau é: x² + (" + b + ")x + " + c + " = 0");
        scanner.close();
    }
}
