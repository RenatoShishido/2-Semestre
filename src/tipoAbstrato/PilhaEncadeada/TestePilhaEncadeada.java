package tipoAbstrato.PilhaEncadeada;
import java.util.Scanner;
public class TestePilhaEncadeada
{
    public static void main(String[] args) {
        PilhaEncadeada<String> pilha = new PilhaEncadeada<>();

        pilha.empilharFinal("A");
        pilha.empilharFinal("B");
        pilha.empilharFinal("C");
        pilha.empilharFinal("D");
        pilha.empilharFinal("E");
        pilha.empilharFinal("F");
        pilha.empilharFinal("G");
        pilha.desempilhar();


        pilha.exibir();


    }
}