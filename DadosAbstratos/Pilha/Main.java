public class Main{
    public static void main(String[] args) {
        PilhaSeq pilha = new PilhaSeq<String>();

        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.imprimir();
    }
}