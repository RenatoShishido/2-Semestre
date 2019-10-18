/**
 * Implementação de um TAD Fila usando lista encadeada.
 * 
 * @author eraldo
 *
 */
public class FilaEncadeada<T> implements Fila<T> {
	/**
	 * Referência para o nó no início da fila.
	 */
	private No<T> inicio;
	/**
	 * Referência para o nó no final da fila.
	 */
	private No<T> fim;
	/**
	 * Armazena o tamanho da fila.
	 */
	private int tamanho;

	/**
	 * Cria uma fila vazia.
	 */
	public FilaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	/**
	 * enfileira um item dentro da fila
	 * 
	 * @param item
	 * 
	 */
	public void enfileirar(T item) {
		if (tamanho == 0) {
			inicio = new No<T>(item, inicio);
			fim = inicio;
			++tamanho;
		} else {
			No<T> nova = new No<T>(item);
			fim.prox = nova;
			fim = nova;
			++tamanho;
		}
	}
	/**
	 * desenfileira um item dentro da fila
	 * 
	 * @return T
	 * 
	 */
	public T desenfileirar() {
		T item = inicio.info;
		inicio = inicio.prox;
		--tamanho;
		return item;
	}

	/**
	 * retorna o primeiro item da fila
	 * 
	 * @return
	 * 
	 */
	public T primeiro() {
		return inicio.info;
	}

	/**
	 * retorna se a fila esta vazia
	 * 
	 * @return
	 * 
	 */
	public boolean vazia() {
		if (inicio.info == null)
			return true;
		else
			return false;
	}

	/**
	 * retorna o tamanho da fila
	 * 
	 * @return
	 * 
	 */
	public int tamanho() {
		return tamanho;
	}

	/**
	 * exibe a fila
	 * 
	 */
	public void exibir() {
		No<T> n = inicio;
		while (n != null) {
			System.out.println(n.info);
			n = n.prox;
		}
	}
}
