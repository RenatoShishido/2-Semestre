package Banco;

public class TestBanco {
	public static void main(String[] args) {
		Pessoa pessoaJuridica = new PessoaJuridica("Renato", "Rua", "995827536","340812", 5 , 3408 ,142, 940812,"06879416415416","1215454"),
	     		pessoaJuridica2 = new PessoaJuridica("Lucas", "Rua", "993478185","064178", 6 , 3408 ,702, 140812, "06879416415416", "156456465");      
	    
 		Pessoa pessoaFisica = new PessoaFisica("Joaquim", "Rua", "993857315","740812", 7 , 3409 ,732, 240812,"06979145185","06122000"),
	     		pessoaFisica2 = new PessoaFisica("Luan", "Rua", "159357456","940812", 8 , 3409 ,782, 340512,"06979145186", "14101997");
	     
	     Gerencia g1 = new Gerencia();
	     g1.Adicionar(pessoaJuridica);
	     g1.Adicionar(pessoaJuridica2);
	     g1.Adicionar(pessoaFisica);
	     g1.Adicionar(pessoaFisica2);
	     g1.Exibir();
	}
}
