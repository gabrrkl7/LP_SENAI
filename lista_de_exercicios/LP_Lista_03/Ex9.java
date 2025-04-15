import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro lado: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o segundo lado: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o terceiro lado: ");
        double c = scanner.nextDouble();
        
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo");
        }
        
        scanner.close();
    }
}