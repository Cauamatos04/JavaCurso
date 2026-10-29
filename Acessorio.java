public class Acessorio extends Produto{
    private String cor;

    public Acessorio(int id, String nome, double preco, int quantidade, String cor) {
        super(id, nome, preco, quantidade);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
