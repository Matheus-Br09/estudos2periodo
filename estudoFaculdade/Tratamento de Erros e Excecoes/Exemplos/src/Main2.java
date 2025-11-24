import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor positivo para calcular o fatorial: ");
        try {
            int digito = teclado.nextInt();
            long f = 1;
            for (int i = digito; i > 1; i--){
                f *= i;
            }
            System.out.println("O fatorial de " + digito + " é: " + f);
        } catch (InputMismatchException e) {
            System.out.println("ERRO!! erro de " + e);
        } catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero!");
        } finally {
            teclado.close();
        }


    }
}
