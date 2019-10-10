import javax.swing.text.StyledEditorKit.BoldAction;

/**
 * Lista encadeada usando tipos genéricos.
 * 
 * @author eraldo
 *
 */
public class ListaEncadeada<T> {

	/**
	 * Referência para o primeiro nó da lista.
	 */
	private No<T> primeiro;

	/**
	 * Número de itens na lista.
	 */
	private int tamanho;

	/**
	 * Cria uma lista encadeada vazia.
	 *
	 */

	public ListaEncadeada() {
		primeiro = null;
		tamanho = 0;
	}

	public ListaEncadeada(int capacidade)
	{
		primeiro = null;
		tamanho = 0;
	}

	/**
	 * Retorna se a lista está vazia.
	 * 
	 * @return
	 */
	public boolean vazia() {
		return primeiro == null;
	}

	/**
	 * Retorna o número de itens nesta lista.
	 * 
	 * @return
	 */
	public int tamanho() {
		return tamanho;
	}

	/**
	 * Retorna o primeiro elemento da lista.
	 * 
	 * @return
	 */
	public T primeiro() {
		return primeiro.info;
	}

	/**
	 * Insere o item dado no início da lista.
	 * 
	 * @param item
	 */
	public void inserir(T item) {
		primeiro = new No<T>(item, primeiro);
		++tamanho;
	}
	public void inverter()
	{
		No<T> dir = primeiro.prox;
		No<T> esq = primeiro;
		No<T> n;

		esq.prox = null;

		while(dir != null){
			n = dir;
			dir = dir.prox;
			n.prox = esq;
			esq = n;
		}
		primeiro = esq;
	}
	public boolean equals(ListaEncadeada<T> o){
		No<T> no = primeiro;
		No<T> no2 = o.primeiro;
		boolean lista = true;

		while(no != null){
			if(!no.info.equals(no2.info)){
				lista = false;
			}
			no = no.prox;
			no2 = no2.prox;
			++tamanho;
		}
		return lista;
	}
        /**
         * Intercala duas lista de mesmo tamanho
         * 
         * @param lista2
         * @return 
         */
        public ListaEncadeada<T> intercala(ListaEncadeada<T> lista2)
	{
		ListaEncadeada<T> lista3 = new ListaEncadeada();

		No<T> noAtualList1 = primeiro;
		No<T> noAtualList2 = lista2.primeiro;
		No<T> noAtualList3 = lista3.primeiro;
                
                
		while(noAtualList1 != null && noAtualList2 != null)
		{
			Comparable info = (Comparable) noAtualList1.info;
			Comparable info2 = (Comparable) noAtualList2.info;
                                
			if(info.compareTo(info2) <= 0){
                            noAtualList3.prox = new No<T>(noAtualList1.info);
                            noAtualList1 = noAtualList1.prox;
			}
			else{
                            noAtualList3.prox = new No<T>(noAtualList2.info);
                            noAtualList2 = noAtualList2.prox;
			}
                        noAtualList3 = noAtualList3.prox;
                        ++lista3.tamanho;
		}
		while(noAtualList1 != null){
			noAtualList3.prox = new No<T>(noAtualList1.info);
			noAtualList1 = noAtualList1.prox;
			noAtualList3 = noAtualList3.prox;
                        ++lista3.tamanho;

		}
		while(noAtualList2 != null){
			noAtualList3.prox = new No<T>(noAtualList2.info);
			noAtualList2 = noAtualList2.prox;
			noAtualList3 = noAtualList3.prox;
                        ++lista3.tamanho;
		}
	
		return lista3;

            }
        /**
	 * Insere o item dado no início da lista.
	 * 
	 * @param item
	 */
	public void selection()
	{
		No<T> i = primeiro;
		No<T> j = i.prox;
		No<T> min = i;

		while(i != null)
		{

			min = i;
			j = i.prox;
			while(j != null)
			{
				Comparable jd = (Comparable) j.info;
				Comparable mini = (Comparable) min.info;
				if(mini.compareTo(jd) >= 0)
				{
					min = j;
				}
				j = j.prox;
			}
			T aux = min.info;
			min.info = i.info;
			i.info =  aux;
			i = i.prox;
		}
            }
        /**
         * Inseri elementos na lista encadeada.
         * 
         * @param item
         * @param posicao 
         */
        public void inserirPosicao(T item, int posicao){
            if(tamanho == 0){
                vazia();
            }
            
            No<T> n = primeiro;
            if(posicao > tamanho)
                {
                    inserirUltimo(item);
                }
            else{
                for(int  i = 0 ; i < posicao ; i++)
                {
                    if(i == posicao - 2)
                    {
                        n.prox = new No<T>(item,n.prox);
                        ++tamanho;
                    }
                    n = n.prox;
                }
            }
        }
        /**
         * remover um item em qual quer posição da lista encadeada.
         * 
         * @param item
         * @param posicao 
         */
        public void removerPosicao(int posicao)
        {
            if(tamanho == 0){
                vazia();
            }
            
            No<T> n = primeiro;
            if(posicao > tamanho)
                {
                    removerUltimo();
                    --tamanho;
                }
            else{
                for(int  i = 0 ; i < posicao ; i++)
                {
                     if(posicao == 1)
                    {
                        primeiro = n.prox;
                        n.prox = null;
                        --tamanho;
                    }
                     else if(i == posicao - 2)
                    {
                        n.prox = n.prox.prox;
                        --tamanho;
                    }
                    n = n.prox;
                }
            }
        }
	/**
	 * Insere o item no penultimo da lista
	 * 
	 * @param item
	 */
	public void inserirPenultimo(T item)
	{
            if(tamanho == 0){
                vazia();
            }

            No<T> n = primeiro;
            while (n != null) {
                    if (n.prox.prox == null) { 
                        n.prox = new No<T>(item, n.prox);
                        n = n.prox.prox; 
                    }
                    n = n.prox;
            }
            ++tamanho;
	}
        public void removerUltimo()
        {
              if(tamanho == 0){
                vazia();
            }

            No<T> n = primeiro;
            while (n != null) {
                    if (n.prox.prox == null) { 
                        n.prox = null;
                    }
                    n = n.prox;
            }
            ++tamanho;
        }
	/**
	 * Insere o item no ultimo da lista
	 * 
	 * @param item
	 */
	public void inserirUltimo(T item)
	{
            if(tamanho == 0){
                vazia();
            }
                
		No<T> n = primeiro;
		while (n != null) {
			if (n.prox == null) {
                            n.prox = new No<T> (item);
                            n = n.prox;
			}
			n = n.prox;
		}
		++tamanho;

	}
	/**
	 * Remove o penultimo item da lista
	 * 
	 * @return
	 */
	public T removerPenultimo()
	{
		No<T> n = primeiro;
		T item = (T) n.prox;
		while (n.prox != null) {
			if (n.prox.info.equals(null)) {
				item = (T) n.prox;
				n.prox = n.prox.prox;
				--tamanho;
			}
			n = n.prox;
		}
		return item;
	}

	/**
	 * Remove o primeiro item da lista e o retorna.
	 * 
	 * @return
	 */
	public T remover() {
		T item = primeiro.info;
		primeiro = primeiro.prox;
		--tamanho;
		return item;
	}

	/**
	 * Busca o item dado e, caso o encontre, o remove da lista.
	 * 
	 * @param item
	 * @return {@code true} se o item foi encontrado (e removido); {@code false}
	 *         caso contrário.
	 */
	public boolean remover(T item) {
		if (primeiro == null)
			return false;

		if (primeiro.info.equals(item)) {
			primeiro = primeiro.prox;
			--tamanho;
			return true;
		}

		No<T> n = primeiro;
		while (n.prox != null) {
			if (n.prox.info.equals(item)) {
				n.prox = n.prox.prox;
				--tamanho;
				return true;
			}
			n = n.prox;
		}

		return false;
	}

	/**
	 * Insere um novo item ({@code novo}) após o item {@code item} na lista.
	 * 
	 * @param item
	 * @param novo
	 * @return {@code true} se o item dado foi encontrado e o novo item foi
	 *         inserido; {@code false} caso o item dado não esteja na lista.
	 */
	public boolean inserirApos(T item, T novo) {
		No<T> n = primeiro;
		while (n != null) {
			if (n.info.equals(item)) {
				n.prox = new No<>(novo, n.prox);
				++tamanho;
				return true;
			}
			n = n.prox;
		}
		return false;
	}

	/**
	 * Exibe todos os elementos da lista.
	 */
	public void exibir() {
		No<T> n = primeiro;
		while (n != null) {
			System.out.println(n.info);
			n = n.prox;
		}
	}

}
