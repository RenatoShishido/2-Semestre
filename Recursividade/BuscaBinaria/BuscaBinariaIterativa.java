/* Inicialização
	 O contador i vale 0 
	 Portanto, variavel numero contém o valor
	dentre v[0..n-1]

 Manutenção
	– Assumindo que é o invariante
	verdadeiro antes de uma iteração
	arbitrária, mostrar que continua
	verdadeiro antes da próxima
																			
	- Por hipotese, temos o inicios da iteração(quando i vale n-1), a variavel numero.

	- Nesta iteração verificar se possui o numero é igual v[n-1]

											   
	-Desta forma a variavel nuemero fica v[n-1] == numero dentro da condição

 Término
	– Após a última iteração, usar o
	invariante para demonstrar a correção
	do algoritmo
	- Usar o invariante já é a correção

*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class BuscaBinariaIterativa
{
	public static int BuscaBin(int [] v , int x)
	{
		int esq = -1;
		int dir = v.length;
		int meio;

		while(esq < dir - 1){
			meio = (esq + dir) / 2;

			if(x > v[meio])
				esq = meio;
			else
				dir = meio;
		}
		return dir;
	}
	public static void main(String[] args) {
		int numero;

		Scanner entrada = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Digite o numero que voce quer: ");
		numero = entrada.nextInt();

		int [] v = new int[9];
		for(int i = 0 ; i < v.length; i ++)
		{
			v[i] = r.nextInt(10);
		}


		for(int i = 0; i < v.length ; i ++)
		{
			for(int j = 0; j < v.length ; j ++)
			{
				if(v[i] < v[j])
				{
					int aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		System.out.println("O vetor e: " + Arrays.toString(v));
		System.out.println("O numero: " + BuscaBin(v, numero));

	}
}