package tipoAbstrato.FilaEmpilhada;
public class FilaEmpilhada
{
	public static void main(String[] args) {
		Fila fila = new Fila();
		Pilha pilha = new Pilha();

		fila.enfileirar(10);
		fila.enfileirar(9);
		fila.enfileirar(8);
		fila.enfileirar(7);
		fila.enfileirar(6);

		pilha.empilhafila(fila);
		pilha.empilhafila(fila);
		pilha.empilhafila(fila);
		pilha.empilhafila(fila);
		pilha.empilhafila(fila);
		fila.mostrar();
		pilha.mostrar();


	}	
}