public interface InterfaceFila<T>
{
    void enfileirar(T e);
    T desinfileirar();
    T primeiro();
    boolean vazia();
    int tamanho();
}