import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Renato", "Rua", "06979145185"),
        pessoa2 = new Pessoa("Luan", "Rua", "069794"),
        pessoa3 = new Pessoa("Pedro", "Rua", "069794");

        PessoaJuridica p3 = new PessoaJuridica("Renato", "Rua", "06979145185","068794164154","1215454");
        PessoaFisica p2 = new PessoaFisica("Renato", "Rua", "06979145185","068794164154154","1215454");
        Agenda agenda = new Agenda();

        agenda.inserir(pessoa);
        agenda.inserir(pessoa2);
        agenda.inserir(pessoa3);
        agenda.inserir(p3);
        agenda.exibir();
    }
}