import java.util.ArrayList;
import java.util.InputMismatchException;

public class ControleFretes {
    public static void main(String[] args){
        ArrayList<Double> listaNegra = new ArrayList<>();

        Entrega c1 = new EntregaNacional(1234, 2000, 15);
        Entrega c2 = new EntregaInternacional(2345, 100, 3);

        double val1 = c1.calcularFrete();
        double val2 = c2.calcularFrete();

        listaNegra.add(val1);
        listaNegra.add(val2);

        double f = 0;
        for (double e: listaNegra){
            f += e;
        }

        System.out.println("Valor total de entregas: R$" + f);



    }
}
