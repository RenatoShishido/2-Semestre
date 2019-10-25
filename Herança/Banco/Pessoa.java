package Banco;
public class Pessoa extends Conta{
    protected String nome;
    protected String endereco;
    protected String telefone;
    
    public Pessoa(){}
    
    public Pessoa(String nome, String endereco, String telefone,String numero, int digito, int agencia, int cvc, int nascimento) {
    	super.numero = numero;
    	super.digito = digito;
    	super.agencia = agencia;
    	super.cvc = cvc;
    	super.Nascimento = nascimento;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public boolean validaTelefone(String telefone){
        if(telefone.length() == 10){
            return true;
        }else return false;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getId(){
        return null;
    }
    public String getVerificacao() {
    	return null;
    }
    public String getName() {
    	return nome;
    }
    @Override
    public String toString() {
        return "Pessoa [endereco=" + endereco + ", nome=" + nome + ", telefone=" + telefone + super.toString() + "]\n";
    }
}