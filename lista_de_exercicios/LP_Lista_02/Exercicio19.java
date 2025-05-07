import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Digite o coeficiente c: ");
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes são: x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("A única raiz é: x = " + x);
        } else {
            System.out.println("Não existem raízes reais.");
        }
        
        scanner.close();
    }
}
