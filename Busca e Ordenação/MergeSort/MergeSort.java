import java.util.Random;
import java.util.Arrays;
public class MergeSort
{
	public static void Merge(int [] v, int esq, int dir)
	{
		if(esq < dir - 1)
		{
			int meio = (dir + esq) / 2;
			Merge(v,esq,meio);
			Merge(v,meio,dir);
			Intercala(v,esq, meio, dir);
		}
	}
	public static void Intercala(int [] v, int esq, int meio, int dir)
	{
		int v2 [] = new int [v.length];
		int i = esq;
		int j = meio;
		int k = 0;

		while(i < meio && j < dir)
		{
			if(v[i] < v[j])
			{
				v2[k] = v[i];
				i++;
			}
			else
			{
				v2[k] = v[j];
				j++;
			}
			k++;
		}
		while(i < meio) 
		{
			v2[k] = v[i];
			i++;
			k++;
		}
		while(j < dir)
		{
			v2[k] = v[j];
			j++;
			k++;
		}
		for(i = esq; i < dir; i ++){
			v[i] = v2[i-esq];
		}

		System.out.println("Vetor: " + Arrays.toString(v));

	}
	public static void main(String[] args) {
		int v [] =  {3, 41, 52, 26, 38, 57, 9, 49};
		
		System.out.println("Vetor: " + Arrays.toString(v));

		int esq = 0;
		int dir = v.length;
		int meio = (esq + dir) / 2;
		Intercala(v,esq , meio, dir);
		Merge(v,esq,dir);

	}
}