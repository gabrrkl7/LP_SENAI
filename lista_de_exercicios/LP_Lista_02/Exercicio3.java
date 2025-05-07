import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        double quintaParte = numero / 5;
        System.out.println("A quinta parte é: " + quintaParte);
        scanner.close();
    }
}
