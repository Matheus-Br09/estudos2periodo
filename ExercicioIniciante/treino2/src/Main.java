import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int n1 = teclado.nextInt();

        System.out.print("Segundo valor: ");
        int n2 = teclado.nextInt();

        System.out.printf("%d + %d = %d \n", n1, n2, n1 + n2);
        System.out.printf("%d - %d = %d \n", n1, n2, n1 - n2);
        System.out.printf("%d x %d = %d \n", n1, n2, n1 * n2);
        System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        System.out.printf("%d mod %d = %d", n1, n2, n1 % n2);
    }
}