public abstract class Entrega {
    protected int codigo;
    protected double peso;
    protected double distancia;

    public Entrega(int codigo, double peso, double distancia) {
        this.codigo = codigo;
        this.peso = peso;
        this.distancia = distancia;
    }

    public abstract double calcularFrete();

}
