package Banco;

public class Previdencia {
	private double taxaRendimento;
	private double taxaRetirada;
	public double getTaxaRendimento() {
		return taxaRendimento;
	}
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	public double getTaxaRetirada() {
		return taxaRetirada;
	}
	public void setTaxaRetirada(double taxaRetirada) {
		this.taxaRetirada = taxaRetirada;
	}
	@Override
	public String toString() {
		return "Previdencia [" + super.toString() + "taxaRendimento=" + taxaRendimento + ", taxaRetirada=" + taxaRetirada + "]";
	}
	
	
}
