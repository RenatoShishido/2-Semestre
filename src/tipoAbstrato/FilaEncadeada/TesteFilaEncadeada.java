package tipoAbstrato.FilaEncadeada;
import java.util.Scanner;
public class TesteFilaEncadeada
{
    public static void main(String[] args) {
        FilaEncadeada<String> fila = new FilaEncadeada<>();
        fila.enfileirar("A");
        fila.enfileirar("B");
        fila.enfileirar("C");
        fila.enfileirar("D");
        fila.enfileirar("E");
        fila.enfileirar("F");

        System.out.println("Item desinfilerado: " + fila.desenfileirar());        
        System.out.println("Item desinfilerado: " + fila.desenfileirar());
        System.out.println("Item desinfilerado: " + fila.desenfileirar());

        fila.exibir();


    }
}