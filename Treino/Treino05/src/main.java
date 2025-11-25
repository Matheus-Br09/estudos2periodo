import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double a = 0;
        try{
            System.out.print("Digite o valor de um pagamento: R$");
            a = teclado.nextDouble();
            System.out.println("Valor de R$" + a);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido!! Digite apenas números");
        }

    }
}
