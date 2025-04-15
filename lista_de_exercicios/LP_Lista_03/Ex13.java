import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        System.out.println("----------------------");
        
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.print("Informe o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.printf("Área = %.2f%n", areaCirculo);
                System.out.printf("Perímetro = %.2f%n", perimetroCirculo);
                break;
                
            case 2:
                System.out.print("Informe a base: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaTriangulo = scanner.nextDouble();
                double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                // Para perímetro, precisamos calcular a hipotenusa
                double hipotenusa = Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(alturaTriangulo, 2));
                double perimetroTriangulo = baseTriangulo + alturaTriangulo + hipotenusa;
                System.out.printf("Área = %.2f%n", areaTriangulo);
                System.out.printf("Perímetro = %.2f%n", perimetroTriangulo);
                break;
                
            case 3:
                System.out.print("Informe a base: ");
                double baseRetangulo = scanner.nextDouble();
                System.out.print("Informe a altura: ");
                double alturaRetangulo = scanner.nextDouble();
                double areaRetangulo = baseRetangulo * alturaRetangulo;
                double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
                System.out.printf("Área = %.2f%n", areaRetangulo);
                System.out.printf("Perímetro = %.2f%n", perimetroRetangulo);
                break;
                
            default:
                System.out.println("Opção inválida");
        }
        
        scanner.close();
    }
}