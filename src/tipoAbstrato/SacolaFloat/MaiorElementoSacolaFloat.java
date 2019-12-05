package tipoAbstrato.SacolaFloat;

public class MaiorElementoSacolaFloat {

	public static float maior(SacolaFloat sacola) {
		float m = sacola.get(0);
		int n = sacola.tamanho();
		for (int i = 1; i < n; ++i) {
			float e = sacola.get(i);
			if (e > m)
				m = e;
		}
		return m;
	}

}
