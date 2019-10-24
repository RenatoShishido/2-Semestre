import java.util.ArrayList;

public class Agenda implements AgendaInterface{
    private ArrayList<Pessoa> pessoa;

 
    public Agenda() {
        pessoa = new ArrayList<Pessoa>();
    }

    public void inserir(Pessoa novaPessoa) {
        pessoa.add(novaPessoa);
    	
    }
    public void remover(String removerPessoa) {
        PessoaFisica p1;
        p1 = (PessoaFisica) pessoa.get(3);
        System.out.println(p1.getCpf());
        System.out.println(p1.getClass().getSimpleName());
        for(int i= 0; i < pessoa.size() ; i ++){
            /*if(pessoa.get(i).nome.equalsIgnoreCase(removerPessoa)){
                pessoa.remove(pessoa.get(i));
            }else if (p1.getCpf().equals(removerPessoa)){
                pessoa.remove(p1.getCpf());
            }*/
         }
    }
    public void ordenarCpf(){
    	
    }

    public void pesquisar(String pesquisa) {

    }
    public void exibir(){
            System.out.println(pessoa.toString());
    }
    public void exibe(){
         for(int i= 0; i < pessoa.size() ; i ++){
            System.out.println(pessoa.get(i));
        }
    }
}