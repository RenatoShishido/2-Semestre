import java.util.Scanner;
import java.util.Random;
public class PotenciaRecursiva{

    static int potencia (int x, int n)
    {
        if(n == 0)
            return 1;
            
            return x * potencia(x, n-1);

    }
    public static void main(String[] args) {
        
        int n , m;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de potencia: ");
        n = entrada.nextInt();
        System.out.println("Digite o número que vai ser potenciado: ");
        m = entrada.nextInt();
        System.out.printf("A potencia e: %d",potencia(n, m));
    }
}