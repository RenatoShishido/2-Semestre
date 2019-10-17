public class Sacola implements SacolaInterface
{
    private int [] vet;
    private int n;
    private int tamanho;

    public Sacola(int tamanho)
    {
        this.tamanho = tamanho;
        vet = new int [tamanho];
        n = 0; 
    }
    public int get(int pegar)
    {
        return vet[pegar];
    }
    public void inserir(int insere)
    {
        vet[n++] = insere;
    }
    public int tamanho()
    {
        return n;
    }
    public int getTamanho()
    {
        return tamanho;
    }
    public void setTamanho(int item)
    {
        this.tamanho = item; 
        vet = new int [tamanho];
    }
}