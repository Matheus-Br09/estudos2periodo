public class PessoaJuridica extends Pessoa{
    String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj){
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }
}
