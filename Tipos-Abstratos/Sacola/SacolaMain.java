public class SacolaMain
{
    public static void main(String[] args) {
        Sacola sacola = new Sacola(5);
        sacola.inserir(20);
        sacola.inserir(10);
        sacola.inserir(5);
        sacola.inserir(15);
        sacola.inserir(0);

        SacolaDobra.Dobra(sacola);
        System.out.println(sacola.getTamanho());

        sacola.inserir(20);
        sacola.inserir(10);
        sacola.inserir(5);
        sacola.inserir(15);
        sacola.inserir(0);
        SacolaDobra.Dobra(sacola);
        System.out.println(sacola.getTamanho());
    }
}