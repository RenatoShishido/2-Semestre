package Herança.Agenda;
public interface AgendaInterface {
    void inserir(Pessoa novaPessoa);

    void remover(String cnpjCpfPessoa);

    Pessoa pesquisar(String cnpjCpfPessoa);

    void ordenaCpf();
    
    void exibir();

}