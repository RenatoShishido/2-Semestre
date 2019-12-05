package tipoAbstrato.ListaPrioridade;
/**
 * Implementa uma fila com prioridades genérica. As prioridades devem ser
 * números inteiros.
 * 
 * @author eraldo
 *
 * @param <T>
 *            tipo dos itens da fila.
 */
public class FilaPrioridade<T> {
	/**
	 * Vetor com os itens e suas prioridades.
	 */
	private ItemPrioridade<T>[] itens;

	/**
	 * Quantidade de itens na fila.
	 */
	private int n;

	/**
	 * Cria uma fila vazia.
	 */
	@SuppressWarnings("unchecked")
	public FilaPrioridade() {
		itens = new ItemPrioridade[10];
	}

	/**
	 * Cria uma fila com a dada capacidade.
	 * 
	 * @param capacidade
	 */
	@SuppressWarnings("unchecked")
	public FilaPrioridade(int capacidade) {
		itens = new ItemPrioridade[capacidade];
	}

	/**
	 * Insere um novo item com a prioridade dada.
	 * 
	 * @param prioridade
	 * @param item
	 */
	public void inserir(int prioridade, T item) {
		itens[n++] = new ItemPrioridade<T>(prioridade, item);
		sobe(n - 1);
	}

	/**
	 * Remove e retorna o item com maior prioridade.
	 * 
	 * @return
	 */
	public T remover() {
		--n;
		T maior = itens[0].item;
		itens[0] = itens[n];
		itens[n] = null;
		desce(0);
		return maior;
	}

	/**
	 * Retorna (sem remover) o item com maior prioridade.
	 * 
	 * @return
	 */
	public T maior() {
		return itens[0].item;
	}

	public boolean vazia() {
		return n == 0;
	}

	/**
	 * Algoritmo sobe. Verifica se o nó i respeita a regra da prioridade em relação
	 * ao seu pai. Se não respeita, troca com seu pai e repete a partir do pai.
	 * 
	 * @param i
	 */
	private void sobe(int i) {
		while (prioridade(pai(i)) < prioridade(i)) {
			troca(pai(i), i);
			i = pai(i);
		}
	}

	/**
	 * Algoritmo desce. Verifica se o nó i respeita a regra da prioridade em relação
	 * aos seus filhos. Se não respeita, troca com seu maior filho e repete a partir
	 * deste filho.
	 * 
	 * @param i
	 */
	private void desce(int i) {
		int maior = i;

		int e = esq(i);
		if (e < n && prioridade(e) > prioridade(maior))
			maior = e;

		int d = dir(i);
		if (d < n && prioridade(d) > prioridade(maior))
			maior = d;

		if (maior != i) {
			troca(i, maior);
			desce(maior);
		}
	}

	/**
	 * Retorna a prioridade do nó i.
	 * 
	 * @param i
	 * @return
	 */
	private int prioridade(int i) {
		return itens[i].prioridade;
	}

	/**
	 * Retorna o pai do nó i.
	 * 
	 * @param i
	 * @return
	 */
	private int pai(int i) {
		if (i == 0)
			return 0;
		return (i - 1) / 2;
	}

	/**
	 * Retorna o filho esquerdo do nó i.
	 * 
	 * @param i
	 * @return
	 */
	private int esq(int i) {
		return 2 * (i + 1) - 1;
	}

	/**
	 * Retorna o filho direito do nó i.
	 * 
	 * @param i
	 * @return
	 */
	private int dir(int i) {
		return 2 * (i + 1);
	}

	/**
	 * Troca os itens i e j.
	 * 
	 * @param i
	 * @param j
	 */
	private void troca(int i, int j) {
		ItemPrioridade<T> aux = itens[i];
		itens[i] = itens[j];
		itens[j] = aux;
	}
	public void imprimirPessoa()
	{
		for(int i = 0 ; i < itens.length ; i++)
		{
			if(itens[i] != null)
			{
				System.out.printf("Item %s e prioridade %d \n" , itens[i].item , itens[i].prioridade);
			}
		}
	}
}
