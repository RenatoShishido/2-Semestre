import java.util.Scanner;

public class TestaFilaPrioridade {

	public static void main(String[] args) {
		// Fila de prioridade cujos itens são strings.
		FilaPrioridade<String> fila = new FilaPrioridade<>();
		int opcao;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("************************************************");
			System.out.println("************************************************");
			System.out.println("************* 1 - InserirPessoa/Prioridade *****");
			System.out.println("************* 2 - impirmePessoa ****************");
			System.out.println("************* 3 - removePessoa *****************");
			System.out.println("************* 0 - SAIR *************************");
			System.out.println("************************************************");
			System.out.println("************************************************");

			opcao = sc.nextInt();

			switch(opcao)
			{
				case 1:
					System.out.println("Digite as pessoas: ");
					String a = sc.next();
					System.out.println("Digite as prioridades: ");
					int p = sc.nextInt();
					fila.inserir(p, a);
					break;
				case 2:
					fila.imprimirPessoa();
					break;
				case 3:
					System.out.println(fila.remover());
					break;
			}
			
		}while(opcao != 0);
	}
}


