import java.util.ArrayList;
import java.util.Arrays;

public class RepositorioConta implements IRepositorioConta{
    private int numero_conta;

    ArrayList<String> titulos = new ArrayList<>();
    ArrayList<Integer> numero_titulares = new ArrayList<>();
    public void inserirConta(ContaBancaria contaBancaria) {
        titulos.add(contaBancaria.nome_titular);
        numero_titulares.add(contaBancaria.numero_titular);
    }

    public void listarContas(){

        for (int x = 0; x < numero_titulares.toArray().length; x++){
            System.out.println(titulos.toArray()[x] + " - " + numero_titulares.toArray()[x]);

        }
    }

}
