public class EntregaNacional extends Entrega{

    public EntregaNacional(int codigo, double peso, double distancia){
        super(codigo, peso, distancia);
    }

    @Override
    public double calcularFrete(){
        return this.peso * 2 + distancia * 0.5;
    }

}