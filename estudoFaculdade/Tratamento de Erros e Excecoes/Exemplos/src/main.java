import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.print("Digite o divisor: ");
            int dividendo = teclado.nextInt();

            System.out.print("Digite o dividendo: ");
            int divisor = teclado.nextInt();

            System.out.println("Resultado: " + dividendo / divisor);
        } catch (ArithmeticException e){
            System.out.println("ERRO!! detectamos o erro " + e);
        }



    }
}
