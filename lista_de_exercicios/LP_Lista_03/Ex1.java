import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();
        
        if (numero >= 0) {
            System.out.printf("A raiz quadrada de %.2f é %.2f%n", numero, Math.sqrt(numero));
        } else {
            System.out.println("Valor inválido!");
        }
        
        scanner.close();
    }
}