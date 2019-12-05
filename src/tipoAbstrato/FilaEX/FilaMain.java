package tipoAbstrato.FilaEX;
import java.util.Arrays;
public class FilaMain
{
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>(5);

        fila.enfileirar(15);
        fila.enfileirar(20);
        fila.enfileirar(25);
        fila.enfileirar(19);
        fila.enfileirar(10);

        fila.enfileirar(500);



        fila.mostrar();

    }
}