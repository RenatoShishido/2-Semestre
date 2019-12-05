package Ordenação;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Algoritmo de Ordem.
 * 
 * @author Renato Shishido
 * 
 * 
 */
public class Ordem
{
	/** 
	 * Verifica ordem crescente 
	 *
	 */
	public static void Verifica(int v [])
	{	
		
		int i , auxO = 0;
		int n = v.length;

		for (i = 0; i < n - 1; i++){
			for(int j = i + 1 ; j < n ; j++){
				if (v[i] <= v[i+1])
					auxO += 1;
			}
		}
		if(auxO == n * 2)
		{
			System.out.println("O vetor esta crescente.");
			System.out.println("O vetor: " + Arrays.toString(v));
		}
		else
		{
			System.out.println("O vetor esta Desordenado.");
			System.out.println("O vetor: " + Arrays.toString(v));
		}
	}
	public static void VerificaSimples(int v [])
	{
		/**
		 * Vefica ordem crescente mais simplificado.
		 * 
		 */
		int aux = 0;
		for(int i = 0 ; i < v.length - 1 ; i++)
		{
			if(v[i] <= v[i+1])
			{
				aux += 1;
			}
		}
		if(aux == v.length - 1){
			System.out.println("Esta ordenado");
			System.out.println("O vetor: " + Arrays.toString(v));
		}
		else{
			System.out.println("Esta desordenado");
			System.out.println("O vetor: " + Arrays.toString(v));
		}
	}
	public static void main(String[] args) {
		Random r = new Random();
		Scanner entrada = new Scanner(System.in);

		int v [] = new int [5];
		/**
		 * ImplemtaÃ§ao do vetor
		 */
		for(int i = 0 ; i < v.length ; i ++)
		{
			v[i] = r.nextInt(10);
		}
		int i, j, x;

		int n = v.length;
		/**
		 * InsertionSort
		 * 
		 */
		for (i = 1; i < n; i++) {
			x = v[i];
		for (j = i - 1; j >= 0 && v[j] > x; j--)
				v[j + 1] = v[j];
			v[j + 1] = x;

		}
	
		VerificaSimples(v);
	}
}