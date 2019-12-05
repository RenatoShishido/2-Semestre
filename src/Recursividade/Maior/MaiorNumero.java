package Recursividade.Maior;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class MaiorNumero
{
    public static final int TAM = 10;
      //MAIOR NUMERO VETOR RECURSIVO
      private static int max(int[] v, int n) 
      {
        //CASO BASE
        if(n == 1)
            return v[0];

        //RECURSIVIDADE PROCURANDO O MAIOR VALOR
        int m = max(v, n - 1);

        if(m > v[n-1])
            return m;
            
        return v[n - 1];
      }
    public static void main(String[] args) {
        Random r = new Random();    
        int [] v = new int[TAM]; 
        for(int i = 0; i < TAM ; i++)
            v[i] = r.nextInt(TAM*10);

        System.out.println("O vetor e:" + Arrays.toString(v));
        System.out.println("O maior numero e: " + max(v, TAM - 1));
    }
}