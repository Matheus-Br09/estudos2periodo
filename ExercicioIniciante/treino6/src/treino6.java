import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.Random;

public class treino6 {
    public static void main(String[] args) {
        Random computador = new Random();
        Scanner teclado = new Scanner(System.in);

        String[] jogadas = new String[3];
        jogadas[0] = "Pedra";
        jogadas[1] = "Papel";
        jogadas[2] = "Tesoura";

        while (true){
            int num_aleatorio = computador.nextInt(3);
            System.out.println("[ 0 ] Pedra \n[ 1 ] Papel \n[ 2 ] Tesoura");

            System.out.print("Sua jogada:");
            int player_selection = teclado.nextInt();

            System.out.println("");
        }

    }
}
