public class PessoaFisica extends Pessoa{
    private String cpf;
    private String datNascimento;

    public PessoaFisica(String nome , String endereço , String telefone, String cpf , String datNascimento) {
        super(nome, endereço, telefone);
        this.cpf = cpf;
        this.datNascimento = datNascimento;
        
    }
    public boolean valida(String numeroCpf){
        super.valida(telefone);
        if(numeroCpf.length() == 11){
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
        return "PessoaFisica [endereço=" + endereço + ", nome=" + nome + ", telefone=" + telefone + "cpf=" + cpf + ", datNascimento=" + datNascimento + "]\n";
    }

}