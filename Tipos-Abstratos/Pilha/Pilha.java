/**
 * TAD Pilha: armazena lista de itens, sendo que os itens são inseridos e
 * removidos da mesma extremidade da lista (topo da pilha). O último elemento
 * inserido será o primeiro a ser removido.
 * 
 * @author eraldo
 *
 */
public interface Pilha<T> {
	/**
	 * Insere um item no topo da pilha.
	 * 
	 * @param item
	 */
	void empilhar(T item);

	/**
	 * Remove o item no topo da pilha e o retorna.
	 * 
	 * @return
	 */
	T desempilhar();

	/**
	 * Retorna o item no topo da pilha (sem removê-lo).
	 * 
	 * @return
	 */
	T topo();

	/**
	 * Retorna {@code true} se a pilha está vazia.
	 * 
	 * @return
	 */
	boolean vazia();

	/**
	 * Retorna o número de itens na pilha.
	 * 
	 * @return
	 */
	int tamanho();
}
