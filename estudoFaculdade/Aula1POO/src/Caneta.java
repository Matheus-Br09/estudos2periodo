public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "ml");
        System.out.print("Está tampada? ");
        if (!this.tampada){
            System.out.println("Não");
        } else {
            System.out.println("Sim");
        }
    }
    void rabiscar(){
        if (this.tampada){
            System.out.println("ERRO! Não é possível rabiscar com a caneta tampada.");
        } else {
            System.out.println("Estou rabiscando!");
        }

    }

    void tampar(){
        if (!this.tampada){
            this.tampada = true;
        } else {
            System.out.println("Caneta já está tampada!");
        }

    }

    void destampar(){
        if (this.tampada){
            this.tampada = false;
        } else {
            System.out.println("Caneta já está destampada");
        }

    }
}
