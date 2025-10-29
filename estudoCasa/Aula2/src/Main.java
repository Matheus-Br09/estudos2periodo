import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");

        String nome = teclado.nextLine();

        System.out.print("Digite sua primeira nota: ");

        float nota1 = teclado.nextFloat();

        System.out.print("Digite sua segunda nota: ");

        float nota2 = teclado.nextFloat();

        float media = (nota1 + nota2) / 2;
        System.out.printf("A média de %s é %.1f \n", nome, media);
        System.out.println("================================");
        if (media > 7){
            System.out.println("<<< APROVADO >>>");
        } else if (media < 5){
            System.out.println("<<< REPROVADO >>>");
        } else {
            System.out.println("<<< RECUPERAÇÃO >>>");
        }
    }
}