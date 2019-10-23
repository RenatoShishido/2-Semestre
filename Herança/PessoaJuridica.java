public class PessoaJuridica<T> extends Pessoa<T> {
    private T cnpj;
    private T insEstadual;

    public PessoaJuridica(T nome , T endereço , T telefone, T cnpj , T insEstadual) {
        super(nome, endereço, telefone);
        this.cnpj = cnpj;
        this.insEstadual = insEstadual;
        
    }
}