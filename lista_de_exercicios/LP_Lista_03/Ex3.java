import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        double n1 = scanner.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double n2 = scanner.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        if (media < 50) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }
        
        scanner.close();
    }
}