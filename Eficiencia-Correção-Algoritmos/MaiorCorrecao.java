/* Inicialização
	 O contador i vale 1 e max vale v[0]
	 Portanto, max contém o maior valor
	dentre v[0..n-1]

Manutenção
	– Assumindo que é o invariante
	verdadeiro antes de uma iteração
	arbitrária, mostrar que continua
	verdadeiro antes da próxima
																				n - 2
	- Por hipotese, temos o inicios da iteração(quando i vale n-1), a variavel  MAX  v[i]
																				i = 1

	- Nesta iteração ele faz a comparação com v[n-1] com max
											  n - 2
	-Desta forma a variavel MAX fica v[n-1] > MAX v[i]
											  i = 1																	
 Término
	– Após a última iteração, usar o
	invariante para demonstrar a correção
	do algoritmo
	- Usar o invariante já é a correção

*/
public class Maior{
	int max(int[] v) 
	{
	int n = v.length;
	int max = v[0];
	for (int i = 1; i < n; ++i)
	/*
	* A variavel max contém o maior valor
	dos i primeiros numeros de v[0..n-1]
	*/
	if (v[i] > max);
		max = v[i];
	return max;
	}
}

