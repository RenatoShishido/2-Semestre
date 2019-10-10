/**
 * TAD Fila: armazena lista de itens, sendo que os itens são inseridos em uma
 * extremidade (final da fila) e removidos da extremidade oposta (início da
 * fila). O primeiro elemento inserido será o primeiro a ser removido.
 * 
 * @author eraldo
 *
 */
public interface Fila<T> {
	/**
	 * Insere um item no final da fila.
	 * 
	 * @param item
	 */
	void enfileirar(T item);

	/**
	 * Remove o item no início da fila e o retorna.
	 * 
	 * @return
	 */
	T desenfileirar();

	/**
	 * Retorna o item no início da fila (sem removê-lo).
	 * 
	 * @return
	 */
	T primeiro();

	/**
	 * Retorna {@code true} se a fila está vazia.
	 * 
	 * @return
	 */
	boolean vazia();

	/**
	 * Retorna o número de itens na fila.
	 * 
	 * @return
	 */
	int tamanho();
}
