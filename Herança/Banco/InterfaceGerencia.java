package Banco;

public interface InterfaceGerencia {
	void Adicionar(Conta conta);

	boolean Remover(String cpfCnpjNomeNumeroConta);
	
	Pessoa Pesquisar(String cpfCnpjNomeNumeroConta);
	
	

}
