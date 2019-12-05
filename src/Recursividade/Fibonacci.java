package Recursividade;
import java.util.Scanner;
public class Fibonacci
{
    public static int fib(int x)
    {
        if(x == 1)
            return 1;
        if(x == 2)
            return 1;

        return fib(x - 1) + fib(x - 2) ;
    }
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero do Fibonacci");
        numero = entrada.nextInt();

        System.out.printf("O fibonacci e: %d" , fib(numero));
    }
}