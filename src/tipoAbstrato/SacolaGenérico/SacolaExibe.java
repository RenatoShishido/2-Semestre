package tipoAbstrato.SacolaGenérico;

public class SacolaExibe {

	public static float maior(Sacola<Float> sacola) {
		float m = sacola.get(0);
		int n = sacola.tamanho();
		for (int i = 1; i < n; ++i) {
			float e = sacola.get(i);
			if (e > m)
				m = e;
		}
		return m;
	}

	public static void exibe(Sacola<Float> sacola) {
		int n = sacola.tamanho();
		for (int i = 0; i < n; ++i)
			System.out.println(sacola.get(i));
	}

	public static void main(String[] args) {
		Sacola<Float> sacola = new SacolaSequencial<Float>();

		sacola.insere(3.2f);
		sacola.insere(1.1f);
		sacola.insere(1.2f);

		exibe(sacola);
		
		System.out.println(maior(sacola));
	}

}
