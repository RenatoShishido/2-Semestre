import java.util.Arrays;
public class Pilha<T> implements InterfacePilha<T>
{
    private T [] vet;
    private int topo;

    public Pilha()
    {
        vet = (T[]) new Object[5];
        topo=-1;
    }
    public Pilha(int capacidade)
    {
        vet = (T[]) new Object[capacidade];
        topo=-1;
    }
    public void empilhafila(Fila fila)
    {
        T item = (T) fila.itens[fila.ini];
        fila.itens[fila.ini] = null;
        fila.ini = (fila.ini + 1) % fila.itens.length;
        fila.tamanho--;

        vet[++topo] = item;

    }
    public void empilha(T pilha)
    {
        vet[++topo] = pilha; 
    }
    public T desempilha()
    {
        T item = vet[topo];
        vet[topo] = null;
        topo--;
        return item;
    }
    public T topo()
    {
        return vet[topo];
    }
    public boolean vazia()
    {
        return topo == -1;
    }
    public int tamanho()
    {
        return topo + 1;
    }
    public void mostrar()
    {
        System.out.println(Arrays.toString(vet));
    }

}