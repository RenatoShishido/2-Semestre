import java.util.Arrays;
public class QuickSort
{
	public static void Quick(int v [] , int esq , int dir)
	{
		int meio;
		if(esq != dir)
		{
			meio = separa(v, esq, dir);
			Quick(v,esq,meio);
			Quick(v,meio+1,dir);

		}
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
			else{
				System.out.println("Vetor: " + Arrays.toString(v));
				System.out.println(j);
				return j;
			}
		}

	}
	public static void main(String[] args) {
		int v [] =  {0, 10, 5, 15, 25, 50, 3, 9};

		System.out.println("Vetor: " + Arrays.toString(v));
		int esq = 0;
		int dir = v.length - 1;
		separa(v,esq,dir);
		Quick(v,esq,dir);
	}
}