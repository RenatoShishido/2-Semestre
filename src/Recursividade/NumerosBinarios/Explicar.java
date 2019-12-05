package Recursividade.NumerosBinarios;

// EU NAO ENTENDI ESSE EXERCICIO PROFESSOR VOU EXPLICAR O QUE EU ENTENDI.
// R: ESSE METÃ“DO ESTÃ� FAZENDO COM APAREÃ‡A O NUMERO BINARIO.

public class Explicar 
{
    public static void foo(int n) {
        if (n != 0) {
          foo(n / 2);
          System.out.printf("%c", '0' + n % 2);
        }
      }

      public static void main(String[] args) {
          Explicar.foo(1);
      }
}