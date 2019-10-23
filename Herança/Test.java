public class Test{
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa pessoa = new Pessoa("Renato", "Rua" , "069794");
        
        agenda.inserir(pessoa);
    }
}