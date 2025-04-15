public class Exercicio4 {
    public static void main(String[] args) {
        for (int c = -80; c <= 80; c += 10) {
            double f = (9.0 / 5.0) * c + 32;
            System.out.printf("%d°C = %.2f°F%n", c, f);
        }
    }
}
