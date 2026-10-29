import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Produto> produtos = new ArrayList<>();
    int id = 0;

    protected void cadastrarProduto(Scanner sc){
        id++;
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Preço: ");
        double preco = sc.nextDouble();
        System.out.println("quantidade: ");
        int quantidade = sc.nextInt();
        System.out.println("Qual tipo do produto");
        System.out.println("1- Ração");
        System.out.println("2- Acessório");
        System.out.println("Digite: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        if(opcao == 1){
            this.cadastrarRacao(sc, nome, preco, quantidade);
        } else if (opcao == 2) {
            //metodo para acessorio
        }else{
            System.out.println("Opção inválida!");
        }
    }

    private void cadastrarRacao(Scanner sc, String nome, double preco, int quantidade){
        System.out.println("Digite o peso: ");
        double peso = sc.nextDouble();
        System.out.println("Qual o sabor?");
        System.out.println("1.Carne");
        System.out.println("2.Peixe");
        System.out.println("3.Frango");
        int opcaoSabor = sc.nextInt();
        Sabor sabor = null;
        switch (opcaoSabor){
            case 1:
               sabor = Sabor.CARNE;
               break;
            case 2:
                sabor = Sabor.PEIXE;
                break;
            case 3:
                sabor = Sabor.FRANGO;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        Racao racao = new Racao(this.id, nome, preco, quantidade, peso, sabor);
        this.produtos.add(racao);
        System.out.println("Cadastrado efetuado!");
    }

    private void cadastrarAcessorio(Scanner sc, String nome, double preco, int quantidade){
        System.out.println("Qual a cor do Acessório: ");
        String cor = sc.nextLine();

        Acessorio acessorio = new Acessorio(this.id, nome, preco, quantidade, cor);
        produtos.add(acessorio);
        System.out.println("Cadastro efetuado!");
    }

    public void listarProdutos(){
        if(this.produtos.isEmpty()){
            System.out.println("Não há produtos cadastrados.");
        }
        for(Produto produto : this.produtos){
            System.out.println(produto);
        }
    }
    private Produto buscarId(Scanner sc){
        System.out.println("Qual o id do produto que deseja atualizar: ");
        int opcao = sc.nextInt();
        for(Produto produto : this.produtos){
            if(opcao == produto.getId()){
                System.out.println("Produto encontrado");
                System.out.println(produto);
            }
                return produto;
            }
        return null;
    }

    private void atualizarNome(Scanner sc){
        Produto produtoEncontrado = buscarId(sc);
        System.out.println("Qual o novo nome do produto: ");
        String novoNome = sc.nextLine();
        produtoEncontrado.setNome(novoNome);
    }

    private void atualizarPreco(Scanner sc){
        Produto produtoEncontrado = buscarId(sc);
        System.out.println("Qual será o novo preço do produto: ");
        double novoPreco = sc.nextDouble();
        produtoEncontrado.setPreco(novoPreco);
    }

    public void atualizarProduto(Scanner sc){

        System.out.println("Informe o que deseja atualizar: \n1- Nome \n2- preço");
        int opcaoAtualizar = sc.nextInt();
        switch (opcaoAtualizar){
            case 1:
                //metodo atualizar nome
                break;
            case 2:
                //metodo atualizar preco
                break;
        }

    }
}


}
