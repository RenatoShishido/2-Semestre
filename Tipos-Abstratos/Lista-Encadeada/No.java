/**
 * Nó de uma lista encadeada.
 * 
 * @author eraldo
 *
 */
class No<T> {
	/**
	 * Referência para o objeto armazenado neste nó.
	 */
	T info;

	/**
	 * Referência para o próximo nó da lista.
	 */
	No<T> prox;

	/**
	 * Cria um nó que referencia o objeto <code>info</code>.
	 * 
	 * @param info
	 */
	No(T info) {
		this.info = info;
		this.prox = null;
	}

	/**
	 * Cria um nó que referencia o objeto <code>infor</code> e aponta para o
	 * próximo nó <code>prox</code>.
	 * 
	 * @param info
	 * @param prox
	 */
	No(T info, No<T> prox) {
		this.info = info;
		this.prox = prox;
	}
}
