package tipoAbstrato.SacolaFloat;
/**
 * Um tipo abstrato de dados que representa uma sacola de números reais.
 * Itens podem ser apenas inseridos e obtidos; mas não podem ser removidos. Os
 * itens são obtidos por posição (índice iniciando em zero).
 * 
 * @author eraldo
 *
 */
public interface SacolaFloat {
	/**
	 * Insere um novo item à sacola.
	 * 
	 * @param item
	 */
	void insere(float item);

	/**
	 * Retorna o item na posição fornecida (índice iniciando em zero).
	 * 
	 * @param i
	 * @return
	 */
	float get(int i);

	/**
	 * @return a quantidade de itens na sacola.
	 */
	int tamanho();
}
