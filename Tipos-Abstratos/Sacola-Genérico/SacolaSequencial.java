/**
 * Implementa o TAD Sacola para números inteiros usando um vetor de tamanho
 * fixo.
 * 
 * @author eraldo
 *
 */
public class SacolaSequencial<T> implements Sacola<T> {

	/**
	 * Vetor onde os itens são armazenados.
	 */
	private T[] vetor;

	/**
	 * Quantidade de itens na sacola.
	 */
	private int n;

	/**
	 * Cria uma sacola vazia.
	 */
	@SuppressWarnings("unchecked")
	public SacolaSequencial() {
		vetor = (T[]) new Object[10];
		n = 0;
	}

	@Override
	public T get(int i) {
		return vetor[i];
	}

	@Override
	public void insere(T item) {
		vetor[n++] = item;
	}

	@Override
	public int tamanho() {
		return n;
	}

}
