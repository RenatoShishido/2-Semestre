public class PessoaFisica extends Pessoa{
    private String cpf;
    private String datNascimento;

    public PessoaFisica(String nome , String endereco , String telefone, String cpf , String datNascimento) {
        super.nome = nome;
        super.endereco = endereco;
        if(validaTelefone(telefone)){
            super.telefone = telefone;
        }
        if(verificarData(datNascimento)) {
        	this.datNascimento = datNascimento;
        }
        if(valida(cpf)){
            this.cpf = cpf;
        }
    }
    public PessoaFisica() {
      }
    public boolean validaTelefone(String telefone){
        if(telefone.length() == 9){
            return true;
        }else return false;
    }
    public boolean valida(String numeroCpf){
        if(numeroCpf.length() == 11){
            return true;
        }else return false;
    }
    public boolean verificarData(String date) {
    	if(date.length() == 8) {
    		return true;
    	}else return false;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
	public String getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(String datNascimento) {
        this.datNascimento = datNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisica [endereco=" + endereco + ", nome=" + nome + ", telefone=" + telefone + ", cpf=" + cpf + ", datNascimento=" + datNascimento + "]\n";
    }
}