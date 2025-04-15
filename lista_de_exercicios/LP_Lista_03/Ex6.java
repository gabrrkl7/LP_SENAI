import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escolha uma opção (5 a 9): ");
        int opcao = scanner.nextInt();
        
        if (opcao >= 5 && opcao <= 9) {
            System.out.println("Opção escolhida: " + opcao);
        } else {
            System.out.println("Opção inválida!");
        }
        
        scanner.close();
    }
}