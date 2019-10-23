public class PessoaFisica<T> extends Pessoa<T>{
    private T cpf;
    private T datNascimento;

    public PessoaFisica(T nome , T endereço , T telefone, T cpf , T datNascimento) {
        super(nome, endereço, telefone);
        this.cpf = cpf;
        this.datNascimento = datNascimento;
        
    }


}