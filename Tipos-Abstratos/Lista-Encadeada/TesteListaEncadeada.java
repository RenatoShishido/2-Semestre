import java.util.Scanner;
public class TesteListaEncadeada
{
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();


        Scanner sc = new Scanner(System.in);
        
        lista.inserir(4);
        lista.inserir(3);
        lista.inserir(2);
        lista.inserir(1);
        lista.inserir(0);
        lista.trocar(1, 3);

        lista.exibir();
        
        
        
    }
}