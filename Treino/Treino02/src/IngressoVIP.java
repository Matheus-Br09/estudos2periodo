public class IngressoVIP extends  Ingresso{

    @Override
    public double calcularValorFinal() {
        return valor_base * 1.20 + 10;
    }
}
