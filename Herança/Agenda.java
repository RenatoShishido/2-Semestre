import java.util.ArrayList;
import java.util.LinkedList;

public class Agenda<T> implements AgendaInterface<T>{
    private LinkedList<T> pessoa;

    public Agenda(){
        pessoa = new LinkedList<T>();
    }

    public void inserir(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }
    public T remover(T pessoa){
        
        return pessoa;
    }
    public void pesquisar(T pesquisa){

    }

}