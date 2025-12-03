import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.print("Digite um valor para o pagamento: R$");
            double valor = teclado.nextDouble();

            System.out.println("Valor pago no valor de R$" + valor);
        } catch (InputMismatchException e){
            System.out.println("Valor inválido, digite apenas números!!!");
        }

    }
}
