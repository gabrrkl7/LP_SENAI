import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        System.out.println("----------------------");
        System.out.println("Menu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");
        System.out.println("----------------------");
        
        System.out.print("Escolha a forma de pagamento: ");
        int opcao = scanner.nextInt();
        
        double valorFinal = valorCompra;
        
        switch (opcao) {
            case 1:
                valorFinal = valorCompra * 0.95; // 5% de desconto
                System.out.println("Débito selecionado");
                break;
                
            case 2:
                valorFinal = valorCompra * 0.90; // 10% de desconto
                System.out.println("Pix selecionado");
                break;
                
            case 3:
                System.out.print("Escolha o número de parcelas (1-10): ");
                int parcelas = scanner.nextInt();
                
                if (parcelas <= 4) {
                    valorFinal = valorCompra * 1.02; // 2% de acréscimo
                } else if (parcelas <= 10) {
                    valorFinal = valorCompra * 1.05; // 5% de acréscimo
                } else {
                    System.out.println("Número de parcelas inválido");
                    return;
                }
                System.out.println("Crédito selecionado");
                break;
                
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        System.out.printf("Valor final da compra: R$ %.2f%n", valorFinal);
        
        scanner.close();
    }
}