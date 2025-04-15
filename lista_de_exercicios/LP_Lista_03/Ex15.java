import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o dinheiro: R$ ");
        double dinheiro = scanner.nextDouble();
        
        System.out.println("----------------------");
        System.out.println("Menu:");
        System.out.println("1. Café Expresso R$ 0,50");
        System.out.println("2. Café Longo R$ 1,00");
        System.out.println("3. Capuccino R$ 2,50");
        System.out.println("4. Chocolate R$ 2,00");
        System.out.println("----------------------");
        
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        
        String bebida = "";
        double preco = 0;
        double troco = 0;
        
        switch (opcao) {
            case 1:
                bebida = "Café Expresso";
                preco = 0.50;
                break;
            case 2:
                bebida = "Café Longo";
                preco = 1.00;
                break;
            case 3:
                bebida = "Capuccino";
                preco = 2.50;
                break;
            case 4:
                bebida = "Chocolate";
                preco = 2.00;
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        if (dinheiro < preco) {
            System.out.println("Dinheiro insuficiente");
        } else {
            troco = dinheiro - preco;
            System.out.println("Bebida selecionada: " + bebida);
            System.out.printf("Seu troco: R$ %.2f%n", troco);
        }
        
        scanner.close();
    }
}