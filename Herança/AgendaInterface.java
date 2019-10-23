public interface AgendaInterface<T>{
    void inserir(Pessoa pessoa);
    T remover(T pessoa);
    void pesquisar(T cpf);


}