import java.util.Scanner;
public class TesteListaEncadeada
{
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        ListaEncadeada<Integer> lista2 = new ListaEncadeada<>();


        Scanner sc = new Scanner(System.in);
        
        lista.inserir(10);
        lista.inserir(8);
        lista.inserir(6);
        lista.inserir(4);
        lista.inserir(2);

        lista2.inserir(9);
        lista2.inserir(7);
        lista2.inserir(5);
        lista2.inserir(3);
        lista2.inserir(1);

        lista.intercala(lista2).exibir();

        
    }
}