public class EspectadorEstudante extends Espectador{

    @Override
    public double valorEntradaAPagar(double valorEntrada){
        return valorEntrada * 0.75;
    }

}
