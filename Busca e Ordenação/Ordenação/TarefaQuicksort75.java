import java.util.Random;

public class TarefaQuicksort75 {

	public static int arrumado(int[] v) {
		int n = v.length;

		// Preenche vetor max[..] tal que max[i] é o maior valor dentre v[0..i].
		int[] max = new int[n];
		max[0] = v[0];
		for (int i = 1; i < n; ++i) {
			if (v[i] > max[i - 1])
				max[i] = v[i];
			else
				max[i] = max[i - 1];
		}

		// Preenche vetor min[..] tal que min[j] é o maior valor dentre v[j..n-1].
		int[] min = new int[n];
		min[n - 1] = v[n - 1];
		for (int j = n - 2; j >= 0; --j) {
			if (v[j] < min[j + 1])
				min[j] = v[j];
			else
				min[j] = min[j + 1];
		}

		/*
		 * Busca q tal que max[q] <= min[q+1], o que é equivalente a v[0..q] <=
		 * v[q+1..n-1].
		 */
		for (int q = 0; q < n - 1; ++q)
			if (max[q] <= min[q + 1])
				return q;
		return -1;
	}

	/**
	 * Testa as implementações acima.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Gera um vetor aleatório com N elementos.
		int N = 5;
		int[] v = new int[N];
		Random r = new Random();
		for (int i = 0; i < N; ++i)
			v[i] = r.nextInt(2 * N) - N;

		// Exibe vetor.
		for (int vv : v)
			System.out.print(vv + " ");
		System.out.println();

		// Verifica se v está arrumado.
		int q = arrumado(v);

		// Exibe q encontrado ou -1 se não existe.
		System.out.println(q);
	}

}