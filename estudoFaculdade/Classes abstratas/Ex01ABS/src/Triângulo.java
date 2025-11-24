public class Triângulo extends Figura{
    private double base;
    private double altura;

    public Triângulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base * altura) / 2;
    }

    public void desenhar(){
        System.out.println("Triângulo");
    }

}
