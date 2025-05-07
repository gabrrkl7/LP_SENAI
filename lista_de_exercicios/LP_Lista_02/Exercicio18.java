import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = scanner.nextDouble();
        if (a != 0) {
            double x = -b / a;
            System.out.println("A solução da equação é x = " + x);
        } else {
            System.out.println("A equação não é do 1º grau (a não pode ser 0).");
        }
        scanner.close();
    }
}
