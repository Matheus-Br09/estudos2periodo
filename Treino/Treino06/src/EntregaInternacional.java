public class EntregaInternacional extends Entrega{

    public EntregaInternacional(int codigo, double peso, double distancia){
        super(codigo, peso, distancia);
    }

    @Override
    public double calcularFrete() {
        return this.peso * 3 + distancia *1.2 + 100;
    }

}