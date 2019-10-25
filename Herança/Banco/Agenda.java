package Banco;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Agenda implements AgendaInterface {
    private ArrayList<Pessoa> pessoa;

    public Agenda() {
        pessoa = new ArrayList<Pessoa>();
    }

    public void inserir(Pessoa novaPessoa) {
        pessoa.add(novaPessoa);

    }

    public void remover(String nomeCpfCnpj) {
        Iterator<Pessoa> it = pessoa.iterator();
        while (it.hasNext()) {
            Pessoa p1 = it.next();
            if (p1.getNome().equals(nomeCpfCnpj)) {
                it.remove();
            }else if(p1.getId().equals(nomeCpfCnpj)){
                it.remove();
            }
        }
    }

    public Pessoa pesquisar(String nomeCpfCnpj) {
        Iterator<Pessoa> it = pessoa.iterator();
        while (it.hasNext()) {
            Pessoa p1 = it.next();
            if (p1.getNome().equals(nomeCpfCnpj)) {
                return p1;
            }else if(p1.getId().equals(nomeCpfCnpj)){
                return p1;
            }
        }
        return null;
    }

    public void ordenaCpf() {
		pessoa.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				boolean p1fisica = p1 instanceof PessoaFisica;
				boolean p2fisica = p2 instanceof PessoaFisica;
				if (p1fisica == p2fisica)
					return p1.getNome().compareTo(p2.getNome());
				else if (p1fisica)
					return -1;
				else 
					return 1;
			}
		});
	}

    public void exibir() {
        for (int i = 0; i < pessoa.size(); i++) {
            System.out.println(pessoa.get(i));
        }
    }

	@Override
	public void ordenarCpf() {
		// TODO Auto-generated method stub
		
	}
}