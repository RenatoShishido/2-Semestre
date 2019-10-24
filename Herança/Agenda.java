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
        for(int i= 0; i < pessoa.size() ; i ++){
            if(pessoa.get(i).nome.equalsIgnoreCase(removerPessoa)){
                pessoa.remove(pessoa.get(i));
            }else if (pessoa.get(i).getId().equalsIgnoreCase(removerPessoa)){
                pessoa.remove(pessoa.get(i));
            }
         }
    }
    public void ordenarCpf(){
    	
    }

    public void pesquisar(String pesquisa) {
        for(int i= 0; i < pessoa.size() ; i ++){
            if(pessoa.get(i).nome.equalsIgnoreCase(pesquisa)){
                System.out.println(pessoa.get(i));
            }else if (pessoa.get(i).getId().equalsIgnoreCase(pesquisa)){
                System.out.println(pessoa.get(i));
            }
        }
    }
    public void exibir(){
         for(int i= 0; i < pessoa.size() ; i ++){
            System.out.println(pessoa.get(i));
        }
    }
}