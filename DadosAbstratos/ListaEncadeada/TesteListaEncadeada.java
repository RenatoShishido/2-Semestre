import java.util.Scanner;
public class TesteListaEncadeada
{
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();
        ListaEncadeada<String> lista2 = new ListaEncadeada<>();


        Scanner sc = new Scanner(System.in);
        
        lista.inserir("Joao");
        lista.inserir("Pedro");
        lista.inserir("Joaquim");
        lista.inserir("Renato");
        lista.inserir("Jucele");
        lista.exibir();
        System.out.println(lista.remover());
        
    }
}