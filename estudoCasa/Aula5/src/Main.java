import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextInt();

        System.out.print("Segunda nota: ");
        float n2 = teclado.nextInt();

        float media = (n1 + n2) / 2;

        System.out.println("Sua média é: " + media);
        if (media > 7){
            System.out.println("PARABÉNS, você passou!!!");
        } else if (media < 5){
            System.out.println("REEEPROVAAADO");
        } else {
            System.out.println("RECUPERAÇÃO!!!");
        }

    }
}