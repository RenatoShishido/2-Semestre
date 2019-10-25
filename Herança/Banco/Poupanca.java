package Banco;

public class Poupanca extends Conta{
	private double taxaRendimento;

	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public String toString() {
		return "Poupanca [" + super.toString() + "taxaRendimento =" + taxaRendimento + "]";
	}
	
	
}
