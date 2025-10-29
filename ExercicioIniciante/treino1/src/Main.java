import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int n1 = teclado.nextInt();

        System.out.print("Segundo número: ");
        int n2 = teclado.nextInt();

        int total_da_mult = n1 * n2;

        System.out.printf("%d x %d = %d", n1, n2, total_da_mult);
    }
}