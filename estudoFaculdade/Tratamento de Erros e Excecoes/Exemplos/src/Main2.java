import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            int dividendo = teclado.nextInt();

            System.out.println("Digite o divisor: ");
            int divisor = teclado.nextInt();

            System.out.println("Resultado: " + dividendo / divisor);
        } catch (ArithmeticException e){
            System.out.println("Não é possível dividir por ZERO!!");
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida!");
        } finally {
            teclado.close();
        }

    }
}
