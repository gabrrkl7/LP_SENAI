import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("----------------------");
        System.out.println("Menu:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("----------------------");
        
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        
        double resultado = 0;
        String operacao = "";
        
        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                operacao = "+";
                break;
            case 2:
                resultado = num1 - num2;
                operacao = "-";
                break;
            case 3:
                resultado = num1 * num2;
                operacao = "x";
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    operacao = "/";
                } else {
                    System.out.println("Erro: divisão por zero");
                    return;
                }
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
        
        System.out.printf("Resultado: %.1f %s %.1f = %.1f%n", num1, operacao, num2, resultado);
        
        scanner.close();
    }
}