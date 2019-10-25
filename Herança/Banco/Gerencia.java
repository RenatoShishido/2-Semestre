package Banco;

import java.util.ArrayList;
import java.util.Iterator;

public class Gerencia {
	private ArrayList<Conta> conta;

	public Gerencia() {
		conta = new ArrayList<>();
	}

	public void Adicionar(Conta c1) {
		conta.add(c1);
	}

	public boolean Remover(String cpfCnpjNomeNumeroConta) {
		Iterator<Conta> it = conta.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (c1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			} else if (c1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return true;
			}
		}
		return false;
	}

	public Conta Pesquisar(String cpfCnpjNomeNumeroConta) {
		Iterator<Conta> it = conta.iterator();
		while (it.hasNext()) {
			Conta c1 = it.next();
			if (c1.getName().equalsIgnoreCase(cpfCnpjNomeNumeroConta)) {
				return  c1;
			} else if (c1.getId().equals(cpfCnpjNomeNumeroConta)) {
				return  c1;
			} else if (c1.getVerificacao().equals(cpfCnpjNomeNumeroConta)) {
				return  c1;
			}
		}
		return null;
	}

	public void Ordenar() {

	}
	public void exebi() {
		System.out.println(conta.toString());
	}
	public void Exibir() {
		Iterator<Conta> it = conta.iterator();
		while(it.hasNext()) {
			Conta c1 = it.next();
			System.out.println(c1);
		}
	}
}
