import java.util.ArrayList;

public class Agenda implements AgendaInterface{
    private ArrayList<Pessoa> pessoa;
 
    public Agenda() {
        pessoa = new ArrayList<Pessoa>();
    }

    public void inserir(Pessoa novaPessoa) {
    		if(novaPessoa.telefone.length() == (9)) {
    			pessoa.add(novaPessoa);
    		}else {
    			System.out.println("Ocorreu um erro ao tentar adicionar essa pessoa: ");
    		}
    		
    	}  

    public void remover(String removerPessoa) {
        for(int i= 0; i < pessoa.size() ; i ++){
            if(pessoa.get(i).nome.equalsIgnoreCase(removerPessoa)){
                pessoa.remove(pessoa.get(i));
            }
         }
    }
    public void ordenarCpf(PessoaFisica individuo, PessoaJuridica individuo2){
    	for(int i = 0; i < pessoa.size() ; i++) {
    		if(pessoa.get(i).equals(individuo2.getCnpj())) {
    			for(int j = 0; j < pessoa.size() ; j++) {
    				if(pessoa.get(i).equals(individuo.getCpf())) {
    					pessoa.set(i, individuo);
    					pessoa.set(j, individuo2);
    				}
    			}
    		}
    	}
    	
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
    public void exibe(){
         for(int i= 0; i < pessoa.size() ; i ++){
            System.out.println(pessoa.get(i));
        }
    }
}