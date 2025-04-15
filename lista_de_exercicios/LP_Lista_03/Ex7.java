import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Não existem raízes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        }
        
        scanner.close();
    }
}