package Ordenação;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
/**
 * Algoritmos de busca.
 * 
 * @author eraldo
 *
 */

 
public class Busca {
	private static final int n = 100000000;

	private static final int numBuscas = 100000;

	/**
	 * Busca sequencial.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaSequencial(int[] v, int x) {
		for (int i = 0; i < v.length; ++i)
			if (x == v[i])
				return i;
		return -1;
	}

	/**
	 * Busca binÃ¡ria.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaBinaria(int[] v, int x) {
		int n = v.length;
		int dir = n;
		int esq = -1;

		while(esq < dir -1)
		{
			int meio = (dir + esq) / 2;

			if(x > v[meio])
				esq = meio;
			else
				dir = meio;
		}

		return dir;

	}

	public static void main(String[] args) {
		System.out.printf("Tamanho do vetor: %d\n", n);
		System.out.printf("NÃºmero de buscas: %d\n", numBuscas);

		int[] v = new int[n];
		for (int i = 0; i < n; ++i)
			v[i] = i;

		Random r = new Random();

		long iniBusca = System.currentTimeMillis();
		for (int i = 0; i < numBuscas; ++i)
			//Busca.buscaSequencial(v, r.nextInt(n));
		Busca.buscaBinaria(v, r.nextInt(n));
		long tmpBusca = System.currentTimeMillis() - iniBusca;

		System.out.printf("    Tempo busca: %f segs\n", tmpBusca / 1000.0);
	}
}
