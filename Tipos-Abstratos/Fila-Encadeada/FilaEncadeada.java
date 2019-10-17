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

	
	public void enfileirar(T item) {
		inicio = new No<T>(item,inicio);
		if(tamanho == 0){
			fim = inicio;
		}
		++tamanho;
	}
	public void enfileirarFinal(T item) {
		if(tamanho == 0){
			enfileirar(item);
		}else{
			No<T> nova = new No<T>(item);
			fim.prox = nova;
			fim = nova;
			++tamanho;
		}

	}
	public T desenfileirar() {
		T item = inicio.info;
		inicio = inicio.prox;
		--tamanho;
		return item;
	}

	public T primeiro() {
		return inicio.info;
	}

	public boolean vazia() {
		if(inicio.info == null)
			return true;
		else
			return false;

	}

	public int tamanho() {
		return tamanho;
	}

	public void exibir() {
		No<T> n = inicio;
		while (n != null) {
			System.out.println(n.info);
			n = n.prox;
		}
	}

}
