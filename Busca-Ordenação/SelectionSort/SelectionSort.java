import java.util.Random;
import java.util.Arrays;
public class SelectionSort
{
	public static void SelectionSort(int [] v)
	{
		int temp;
		int n = v.length;

		for(int i = 0 ; i < n - 1; i ++ )
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

		System.out.println("Vetor Ordenado: " + Arrays.toString(v));
		
	}
	public static void main(String[] args) {
		int [] v = new int [10];

		Random r = new Random();

		for(int i = 0; i < v.length ; i++)
		{
			v[i] = r.nextInt(10);
		}

		System.out.println("Vetor Desordenado: " + Arrays.toString(v));
		SelectionSort(v);

	}
}