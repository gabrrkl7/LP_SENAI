import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double n2 = scanner.nextDouble();
        
        double media = (n1 + n2) / 2;
        char conceito;
        
        if (media >= 8.5) {
            conceito = 'A';
        } else if (media >= 7) {
            conceito = 'B';
        } else if (media >= 5) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }
        
        System.out.printf("Média: %.1f - Conceito: %c%n", media, conceito);
        
        scanner.close();
    }
}