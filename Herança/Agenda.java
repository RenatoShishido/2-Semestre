import java.util.ArrayList;
import java.util.Arrays;

public class Agenda<T>{
    private ArrayList pessoa;
    private int i;

    public Agenda() {
        pessoa = new ArrayList<T>();
        i = 0;
    }

    public void inserir(Pessoa novaPessoa) {
        pessoa.add(novaPessoa);
        
    }

    public void remover(String removerPessoa) {
        for(int i= 0; i < pessoa.size() ; i ++){
            if(pessoa.get(i).equals(removerPessoa)){
                pessoa.remove(pessoa.get(i));
            }
        }
    }
    public void ordenarCpf(){
        int min;
        for(int i= 0; i < pessoa.size() ; i ++){
            min = i;
            for(int j= 0; j < pessoa.size() ; j ++){
                if(j < min){
                    min = j;
                }
            }/*
            int aux = pessoa.get(i);
            pessoa.get(i) = pessoa.get(min);
            pessoa.get(min) = pessoa.get(aux);*/
            
        }
    }

    public void pesquisar(String pesquisa) {

    }
    public void exibir(){
            System.out.println(pessoa.toString());
    }
}