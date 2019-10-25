package Banco;

public class Conta {
	protected String numero;
	protected int digito;
	protected int agencia;
	protected int cvc;
	protected int Nascimento;

	public Conta() {
	}

	public Conta(String numero, int digito, int agencia, int cvc, int nascimento) {
		this.numero = numero;
		this.digito = digito;
		this.agencia = agencia;
		this.cvc = cvc;
		this.Nascimento = nascimento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public int getNascimento() {
		return Nascimento;
	}

	public void setNascimento(int nascimento) {
		Nascimento = nascimento;
	}

	public String getVerificacao() {
		return numero;
	}
	public String getId() {
		return null;
	}
	public String getName() {
		return null;
	}

	@Override
	public String toString() {
		return " Conta[" + "numero=" + numero + ", digito=" + digito + ", agencia=" + agencia
				+ ", cvc=" + cvc + ", Nascimento=" + Nascimento ;
	}
}
