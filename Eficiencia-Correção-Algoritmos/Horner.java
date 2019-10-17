//(b) Escreva um programa com tempo de execução de pior caso O(n) para solucionar este problema usando o método chamado de regra de Horner para reescrever o polinômio:
//nX−1 i=1 aixi = (· · ·(an−1x + an−2)x + · · · + a1)x + a0 .
//R:
//POLINOMIO REGRA DE HORNER
public class Horner
{
	public static final int TAM = 3;

	public static int Polinomio(int n, int a[] , int x)
	{
		int i,p;
		
		p=a[n];

		for(i= n-1; i >= 0; --i )
		{
			p = p * x + a[i];
		}
		return p;
	
	}
	public static void main(String[] args) {
		int a [] = new int[TAM];

		a[0] = 3;
		a[1] = 2;
		a[2] = 1;


		System.out.println("O p e : " + Polinomio(2, a , 2));
	}
}
