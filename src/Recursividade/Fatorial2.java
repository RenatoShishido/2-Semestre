package Recursividade;
import java.util.Scanner;
public class Fatorial2
{
        //FATORIAL
       public static int fat(int n)
       {
            int f = 1;
            for(; n  > 1 ; --n){
                f = f * n;
            }
            return f;
        }
        //FATORIAL RECURSIVO
        public static int fatR(int n)
        {
            if(n == 0)
                return 1;

            return n *fatR(n - 1);
        }
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero do FATORIAL");
        numero = entrada.nextInt();

        System.out.printf("O fatorial e: %d" , fatR(numero));

        
    }
}