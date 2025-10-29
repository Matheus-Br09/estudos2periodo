public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public void calcularArea(){
        System.out.println("Área do círculo: " + (Math.round(Math.PI) * (raio * raio)));
    }
}
