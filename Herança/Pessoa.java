public class Pessoa<T>{
   protected T nome;
   protected T endereço;
   protected T telefone;

   public Pessoa(T nome , T endereço, T telefone){
       this.nome = nome;
       this.endereço = endereço;
       this.telefone = telefone;
   }
}