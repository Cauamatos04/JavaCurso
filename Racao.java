public class Racao extends Produto{
    private Sabor sabor;
    private double peso;

    public Racao(int id, String nome, double preco, int quantidade, double peso, Sabor sabor) {
        super(id, nome, preco, quantidade);
        this.sabor = sabor;
        this.peso = peso;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
