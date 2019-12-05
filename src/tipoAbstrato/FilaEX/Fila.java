package tipoAbstrato.FilaEX;
import java.util.Arrays;
public class Fila<T> implements InterfaceFila<T>
{
    private T [] vet;
    private int inicio;
    private int fim;

    public Fila()
    {
        vet = (T[]) new Object[10];
        inicio = 0;
        fim = -1;
    }
    public Fila(int capacidade)
    {
        vet = (T[]) new Object[capacidade];
        inicio = 0;
        fim = -1;
    }
    public void enfileirar(T fila)
    {
        if(fim == vet.length - 1 && inicio != 0){
            fim = fim - vet.length;
            vet[++fim] = fila; 
        }
        else
            vet[++fim] = fila;
    }
    public T desinfileirar()
    {
        T fila = vet[inicio];
        vet[inicio] = null;
        inicio++;
        return fila;
    }
    public T primeiro()
    {
        return vet[inicio];
    }
    public boolean vazia()
    {
        int aux=0;
        for(int i = 0 ; i < vet.length ; i++)
        {
            if(vet[i] == null)
                aux++;
        }
        if(aux == vet.length)
            return true;
        return false;
    }
    public int tamanho()
    {
        return fim + 1;
    }
    public void mostrar()
    {
        System.out.println(Arrays.toString(vet));
    }
}