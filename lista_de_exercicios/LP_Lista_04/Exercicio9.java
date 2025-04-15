import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente;

        do {
            boolean perdeu = false;

            outer:
            for (int i = 1; i <= 10; i++) {
                for (int j = 0; j <= 10; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scanner.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Errado! Fim de jogo.");
                        perdeu = true;
                        break outer;
                    }
                }
            }

            if (!perdeu) {
                System.out.println("Parabéns! Você completou toda a tabuada!");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            jogarNovamente = scanner.next().equalsIgnoreCase("s");

        } while (jogarNovamente);
    }
}
