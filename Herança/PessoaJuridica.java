public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String insEstadual;

    public PessoaJuridica(String nome , String endereço , String telefone, String cnpj , String insEstadual) {
        super(nome, endereço, telefone);
        this.insEstadual = insEstadual;
        if(valida(cnpj)){
            this.cnpj = cnpj;
        }
    }
    public PessoaJuridica() {
	}
	public boolean valida(String cnpj){
        if(cnpj.length() == 14){
            return true;
        }else return false;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInsEstadual() {
        return insEstadual;
    }

    public void setInsEstadual(String insEstadual) {
        this.insEstadual = insEstadual;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [endereço=" + endereço + ", nome=" + nome + ", telefone=" + telefone + ", cnpj=" + cnpj + ", insEstadual=" + insEstadual + "]\n";
    }
}