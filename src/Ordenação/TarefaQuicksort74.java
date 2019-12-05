package Ordenação;
import java.util.Random;

public class TarefaQuicksort74 {

	/**
	 * Separa os elementos do vetor v[0..n-1] talque v[0..q] <= 0 < v[q+1..n-1].
	 * 
	 * @param v
	 */
	public static void separaPositivosNegativos(int[] v) {
		int i = -1;
		int j = v.length;
		while (true) {
			do {
				--j;
			} while (i < j && v[j] > 0);

			do {
				++i;
			} while (i < j && v[i] <= 0);

			if (i < j)
				troca(v, i, j);
			else
				return;
		}
	}

	/**
	 * Troca os valores de v[i] e v[j].
	 * 
	 * @param v
	 * @param i
	 * @param j
	 */
	public static void troca(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	/**
	 * Testa as implementaÃ§Ãµes acima.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Gera um vetor aleatÃ³rio com N elementos.
		int N = 5;
		int[] v = {0,5,2,-3,-1};
		Random r = new Random();
	

		// Separa positivos e negativos.
		separaPositivosNegativos(v);

		// Exibe vetor separado.
		for (int vv : v)
			System.out.print(vv + " ");
		System.out.println();
	}

}