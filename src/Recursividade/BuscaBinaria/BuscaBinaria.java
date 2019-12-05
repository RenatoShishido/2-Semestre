package Recursividade.BuscaBinaria;

/*
 CASO BASE
 	- Se ori = 2 e fim = 1 entra no if e retorna -1
 		Como se ori > fim funciona para qualquer algoritmo até quando não acha o numero em questão.
 	- Se v[med] = n entra no if e retorna a propria variavel med.
 		Como se a metade do vetor fosse igual ao numero em questão.

 PASSO INDUTIVO
 	-Hipotese de indução
	 Bin(v[] , ori, fim , k) retorna k caso esteja dentro do vetor
	 para todo k[0 .. n-1]

	 -Assumindo a hipotese de indução, mostrar que Bin(v[] , ori, fim , k) retorna k[0 .. n-1] ou -1
	 	Para k > med , o algoritmo entra no return Bin(v, med + 1 , fim , k);
	 	Para k < med , o algoritmo entra no if que gera return Bin(v, ori , med - 1 , k);

PORTANTO Bin([] v , ori, fim, n) retorna o indice do numero em questão dentro do vetor ou caso não encontre o
	numero dentro do vetor ele retorna -1.
	
*/

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class BuscaBinaria
{

	private static final int TAM = 7;
	private static final int inicio = -1;
	private static final int fim = TAM;


	public static int Bin(int [] v,int dir, int esq , int n)
	{

		if(esq == dir -1)
			return dir;

		int med = (dir + esq) / 2;

		if(v[med] < n)
			return Bin(v, esq , med , n);

		return Bin(v, med, dir , n);

	}

	public static void main(String[] args) {
		int numero;
		Random r = new Random();
		Scanner entrada = new Scanner(System.in);

		int v []  = new int [TAM];
		System.out.println("Digite o numero: ");
		numero = entrada.nextInt();

		for(int i = 0 ; i < TAM ; i++)
		{
			v[i] = r.nextInt(10);
		}
		int temp;
		int n = v.length;
		for(int i = 0 ; i < n - 1 ; i ++ )
		{
			int min = i;
			for(int j = i +1 ; j < n ; j++)
			{
				if(v[j] < v[min])
					min = j;
			}
			temp = v[i];
			v[i] = v[min];
			v[min] = temp;
		}


		System.out.printf("Vetor: %s \n" , Arrays.toString(v));
		System.out.printf("Numero esta: %d \n" , Bin(v,inicio,fim,numero));
	}
}