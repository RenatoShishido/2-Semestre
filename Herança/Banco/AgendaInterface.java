package Banco;
public interface AgendaInterface {
    void inserir(Pessoa novaPessoa);

    void remover(String cnpjCpfPessoa);

    Pessoa pesquisar(String cnpjCpfPessoa);

    void ordenarCpf();
    
    void exibir();

}