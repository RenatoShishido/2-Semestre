package Ordenação.QuickSort;
import java.util.Arrays;
public class QuickSortCauda
{
	public static void Quick(int v [] , int esq , int dir)
	{
		int meio;
		while(esq < dir)
		{
			meio = separa(v, esq, dir);
			Quick(v,esq,meio);
			esq = meio + 1;
		}
		System.out.println("Vetor: " + Arrays.toString(v));
	}
	public static int separa(int  v [] , int esq, int dir)
	{
		int i, j, array;

		array = v[esq];
		i = esq - 1;
		j = dir + 1;

		while(true)
		{
			do
			{
				j--;
			}while(v[j] > array);
			do
			{
				i++;
			}while(v[i] < array);
			if(i < j)
			{
				int aux;
				aux = v[i];
				v[i] = v[j];
				v[j] = aux;
			}
			else 
				return j;
		}
	}
	public static void main(String[] args) {
		int v [] =  {21, 7, 5, 11, 6, 42, 13, 2};

		System.out.println("Vetor: " + Arrays.toString(v));
		int esq = 0;
		int dir = v.length - 1;
		separa(v,esq,dir);
		Quick(v,esq,dir);
	}
}