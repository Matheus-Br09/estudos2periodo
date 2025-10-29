public class Elevador {
    private int andarAtual;
    private final int totalAndares;
    private final int capacidade;
    private boolean statusPorta;

    public Elevador(int totalAndares, int capacidade, boolean statusPorta){
        andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.statusPorta = statusPorta;
    }

    public void exibirSituacao(){
        System.out.println("Andar atual: " + this.andarAtual + "° Andar.");
        System.out.println("Total de andares: " + this.totalAndares);
        System.out.println("Capacidade máxima: " + this.capacidade + "Kg");
        if (statusPorta){
            System.out.println("Porta: Aberta");
        } else {
            System.out.println("Porta: Fechada");
        }
    }

    public void abrir_porta(){
        if (statusPorta){
            System.out.println("Porta já está aberta");
            return;
        }

        this.statusPorta = true;
    }

    public void fechar_porta(){
        if (!statusPorta){
            System.out.println("Porta já está fechada");
            return;
        }

        this.statusPorta = false;
    }

    public void subir(){
        if (this.andarAtual == this.totalAndares){
            System.out.println("ERRO! Você está no último andar\n");
            return;
        } else if (this.statusPorta){
            System.out.println("ERRO! Porta aberta!\n");
            return;
        }

        this.andarAtual += 1;



    }

    public void descer(){
        if (this.andarAtual == 0){
            System.out.println("ERRO! Você já está no Térreo\n");
            return;
        } else if (this.statusPorta){
            System.out.println("ERRO! Porta aberta!\n");
            return;
        }

        this.andarAtual -= 1;
    }

}
