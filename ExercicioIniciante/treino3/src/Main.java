import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor para a tabuada: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d \n", num, i, num * i);
        }
    }
}