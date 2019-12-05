package tipoAbstrato.SacolaFloat;

public class MaiorElementoSacolaFloatMain {

	public static void main(String[] args) {
		SacolaFloatSequencial sacola = new SacolaFloatSequencial();
		sacola.insere(10);
		sacola.insere(20);
		sacola.insere(5);

		System.out.println(MaiorElementoSacolaFloat.maior(sacola));
	}

}
