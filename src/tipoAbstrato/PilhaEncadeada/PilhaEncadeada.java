package tipoAbstrato.PilhaEncadeada;

public class PilhaEncadeada<T> implements Pilha<T> {

	private No<T> inicio;


	private No<T> fim;

	/**
	 * Armazena o tamanho da fila.
	 */
	private int tamanho;

	/**
	 * Cria uma fila vazia.
	 */
	public PilhaEncadeada() {
		inicio = null;
		fim = null;
		tamanho = 0;
	}

	
	public void empilhar(T item) {
		inicio = new No<T>(item,inicio);
		if(tamanho == 0){
			fim = inicio;
		}
		++tamanho;
	}
	public void empilharFinal(T item) {
		if(tamanho == 0){
			empilhar(item);
		}else{
			No<T> nova = new No<T>(item);
			fim.prox = nova;
			fim = nova;
			++tamanho;
		}

	}
	public void desempilhar() {
		No<T> n = inicio;
		while(n != null){
			if(n.prox.prox == null){
				n.prox = null;
			}
			n = n.prox;
		}
	}

    public T topo() {
		return fim.info;
	}

    public boolean vazia() {
		if(fim == null)
			return true;
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
