import java.util.Random;
import java.util.Arrays;
public class InsertionSort
{
	public static void Insertion(int []v)
	{
		int i, j, x;

		int n = v.length;

		for (i = 1; i < n; i++) {
			x = v[i];
		for (j = i - 1; j >= 0 && v[j] > x; j--)
				v[j + 1] = v[j];
			v[j + 1] = x;

		}
		System.out.println("O InsertionSort: " + Arrays.toString(v));
	}
	public static void main(String[] args) {
		Random r = new Random();

		int [] v = new int[5];

		for(int i =0 ; i < v.length; i++)
		{
			v[i] = r.nextInt(10);
		}



		System.out.println("O vetor: " + Arrays.toString(v));	
		Insertion(v);
	}
}