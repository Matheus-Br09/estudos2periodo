import java.util.ArrayList;
import java.util.InputMismatchException;

public class ControleFretes {
    public static void main(String[] args){
        ArrayList<Double> listaEntregas = new ArrayList<>();

        Entrega e1 = new EntregaNacional(1234, 4, 15.4);
        Entrega e2 = new EntregaInternacional(2345, 4, 15.4);

        double val1 = e1.calcularFrete();
        double val2 = e2.calcularFrete();

        listaEntregas.add(val1);
        listaEntregas.add(val2);

        double f = 0;
        for (Double e: listaEntregas){
            f += e;
        }

        System.out.println("Total das entregas: " + f);
        System.out.println("Média: " + f / (listaEntregas.toArray().length));

    }
}
