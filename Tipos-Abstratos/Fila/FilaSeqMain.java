public class FilaSeqMain{
    public static void main(String[] args) {
        FilaSeq<Integer> fila = new FilaSeq<>();

        fila.enfileirar(10);
        fila.enfileirar(30);
        fila.enfileirar(20);
        fila.enfileirar(5);
        fila.enfileirar(0);
        fila.enfileirar(10);
        fila.enfileirar(30);
        fila.enfileirar(20);
        fila.enfileirar(5);
        fila.enfileirar(0);
        System.out.println(fila.desenfileirar());
        fila.enfileirar(0);

        fila.exibir();

        

    }
}