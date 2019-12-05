package tipoAbstrato.Pilha;
import java.util.Arrays;
/**
 * Implementa o TAD Pilha usando um vetor para armazenar os itens.
 * 
 * @author eraldo
 *
 * @param <T>
 */
public class PilhaSeq<T> implements Pilha<T> {

	/**
	 * Vetor que armazena os itens na pilha.
	 */
	private T[] itens;

	/**
	 * Ã?ndice do topo da pilha.
	 */
	private int topo;

	/**
	 * Cria uma pilha vazia.
	 */
	@SuppressWarnings("unchecked")
	public PilhaSeq() {
		topo = -1;
		itens = (T[]) new Object[10];
	}

	/**
	 * Cria uma pilha vazia com a capacidade.
	 */
	@SuppressWarnings("unchecked")
	public PilhaSeq(int capacidade) {
		topo = -1;
		itens = (T[]) new Object[capacidade];
	}

	@Override
	public void empilhar(T item) {
		itens[++topo] = item;
	}

	@Override
	public T desempilhar() {
		T item = itens[topo];
		itens[topo] = null;
		--topo;
		return item;
	}

	@Override
	public T topo() {
		return itens[topo];
	}

	@Override
	public boolean vazia() {
		return topo == -1;
	}

	@Override
	public int tamanho() {
		return topo + 1;
	}

	public void imprimir(){
		System.out.println(Arrays.toString(itens));
	}

}
