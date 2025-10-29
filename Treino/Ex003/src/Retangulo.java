public class Retangulo extends Forma{
    private double largura, altura;

    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea(){
        System.out.println("Área do retângulo: " + (largura * altura));
    }

}
