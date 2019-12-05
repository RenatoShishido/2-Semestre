package Recursividade.MaiorNumero;

// RENATO TOMIO DE SOUZA SHISHIDO.
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MaiorNumero
{
    //CRIANDO TAMANHO DO VETOR.
    private static final int TAM = 10;

      //MAIOR NUMERO VETOR RECURSIVO.
      public static int max(int[] v, int n) 
      {
        //CASO BASE
        if(n == 1)
            return v[0];

        //METODO RECURSIVO
        int m = max(v, n - 1);

        if(m > v[n-1])
        return m;
            
        return v[n - 1];
      }
      public static void main(String[] args) {
        Random r = new Random();
        int [] v = new int [TAM]; 
        for(int i = 0; i < TAM ; i ++)
        {
        v[i] = r.nextInt(TAM);
        }
        System.out.printf("Vetor: %s", Arrays.toString(v));
        System.out.printf("O maior numero e: %d", max(v,TAM));
    }
}