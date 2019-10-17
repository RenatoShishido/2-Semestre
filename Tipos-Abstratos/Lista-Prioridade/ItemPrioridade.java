/**
 * Representa um item em uma fila com prioridades.
 * 
 * @author eraldo
 *
 * @param <T>
 *            tipo dos itens.
 */
class ItemPrioridade<T> {

	/**
	 * Prioridade do item.
	 */
	int prioridade;

	/**
	 * Referência para o item.
	 */
	T item;

	/**
	 * Cria um item vazio.
	 */
	ItemPrioridade() {
	}

	/**
	 * Cria um item com a prioridade dada.
	 * 
	 * @param prioridade
	 * @param item
	 */
	ItemPrioridade(int prioridade, T item) {
		this.prioridade = prioridade;
		this.item = item;
	}

}
