package tipoAbstrato.FilaEmpilhada;
public interface InterfacePilha<T>
{
    void empilha(T itens);
    T desempilha();
    T topo();
    boolean vazia();
    int tamanho();
}