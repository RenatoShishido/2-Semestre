import java.util.Scanner;
public class TesteFilaEncadeada
{
    public static void main(String[] args) {
        FilaEncadeada<String> fila = new FilaEncadeada<>();
        fila.enfileirarFinal("A");
        fila.enfileirarFinal("B");
        fila.enfileirarFinal("C");
        fila.enfileirarFinal("D");
        fila.enfileirarFinal("E");
        fila.enfileirarFinal("F");

        System.out.println("Item desinfilerado: " + fila.desenfileirar());        

        fila.enfileirarFinal("C");
        fila.enfileirarFinal("D");
        fila.enfileirarFinal("E");
        fila.enfileirarFinal("F");

        System.out.println("Item desinfilerado: " + fila.desenfileirar());
        System.out.println("Item desinfilerado: " + fila.desenfileirar());


        fila.exibir();


    }
}