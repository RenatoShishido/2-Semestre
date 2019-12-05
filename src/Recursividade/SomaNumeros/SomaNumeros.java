package Recursividade.SomaNumeros;

public class SomaNumeros {

  public static int somar(int array[], int tamArray) {
      if (tamArray > 0) {
          int soma = array[tamArray - 1] + somar(array, tamArray - 1);
          return soma;
      } else {
          return 0;
      }
  }

  public static void main (String[] args) {
      int[] vals = {1, 2, 3, 4, 5};
      System.out.println(somar(vals, vals.length));
  }
}
