import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int quadrado = numero * numero;
        System.out.println("O quadrado é: " + quadrado);
        scanner.close();
    }
}
