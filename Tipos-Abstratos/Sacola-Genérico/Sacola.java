/**
 * Um tipo abstrato de dados que representa uma sacola de números inteiros.
 * Itens podem ser apenas inseridos e obtidos; mas não podem ser removidos. Os
 * itens são obtidos por posição (índice iniciando em zero).
 * 
 * @author eraldo
 *
 */
public interface Sacola<T> {
	/**
	 * Insere um novo item à sacola.
	 * 
	 * @param item
	 */
	void insere(T item);

	/**
	 * Retorna o item na posição fornecida (índice iniciando em zero).
	 * 
	 * @param i
	 * @return
	 */
	T get(int i);

	/**
	 * @return a quantidade de itens na sacola.
	 */
	int tamanho();
}
