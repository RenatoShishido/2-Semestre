package Ordenação;
//RENATO TOMIO DE SOUZA SHISHIDO
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class BuscaOrdenada
{
	public static int Ordem(int [] v , int x)
	{
		int dir = v.length;
		int esq = -1;

		for(int i = 0 ; i < v.length - 1; i++)
		{
			for(int j = i + 1; j < v.length ; j++)
			{
				if(v[i] > v[j])
				{
				int aux = v[i];
				v[i] = v[j];
				v[j] = aux;
				}
			}
		}
		System.out.println("Selection Sort e BuscaBin: "  + Arrays.toString(v));
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
		Scanner entrada = new Scanner (System.in);
		Random r = new Random();

		int [] v =  new int [10];

		for(int i = 0 ; i < v.length - 1; i++)
		{
			v[i] = r.nextInt(10);
		}

		System.out.println("O vetor Desordenado: "  + Arrays.toString(v));
		System.out.println("Ordem e: "  + Ordem(v,4));









	}
}