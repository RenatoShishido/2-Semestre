package Ordenação;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Ordenacao
{
	public static void main(String[] args) {
		Random r = new Random();
		Scanner entrada = new Scanner(System.in);

		int v [] = new int [10];

		for(int i = 0 ; i < v.length ; i++ )
		{
			v[i] = r.nextInt(10);
		}

		System.out.println("Vetor: " + Arrays.toString(v));

		for(int i = 0; i < v.length - 1 ; i ++)
		{
			for(int j = i+1; j < v.length ; j ++)
			{
				if(v[i] > v[j])
				{
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		
		System.out.println("Vetor Ordenado: " + Arrays.toString(v));
		






	}
}