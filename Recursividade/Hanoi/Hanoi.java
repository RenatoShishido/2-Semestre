
public class Hanoi {
	static void hanoi(int n, char origem, char auxiliar, char destino) {
		if (n > 0) {
			hanoi(n - 1, origem, destino, auxiliar);
			System.out.printf("%c -> %c\n", origem, destino);
			hanoi(n - 1, auxiliar, origem, destino);
		}
	}
	
	public static void main(String[] args) {
		hanoi(3, 'A', 'B', 'C');
	}
}
