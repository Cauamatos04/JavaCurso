import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("--MENU--");
            System.out.println("1- cadastrar" +
                    "\n2- Listar" +
                    "\n3- Atualizar" +
                    "\n4- Buscar" +
                    "\n5- Remover" +
                    "\n6- sair" +
                    "\nDigite: "
            );
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    System.out.println("saindo...");

                default:
                    System.out.println("opção inválida");
            }
        }
    }
}
