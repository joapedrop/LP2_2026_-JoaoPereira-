import csv.ArquivoProdutoCSV;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArquivoProdutoCSV arquivo = new ArquivoProdutoCSV();
        int op;

        do {

            System.out.println("Escolha a Opção:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Alterar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = teclado.nextInt();
            switch (op) {
                case 1:
                    Produto produto = new Produto();
                    System.out.println("Cadastrar Produto");
                    System.out.print("Id: ");
                    produto.setId(teclado.nextInt());
                    teclado.nextLine();

                    System.out.print("Nome: ");
                    produto.setNome(teclado.nextLine());

                    System.out.print("Preço: ");
                    produto.setPreco(teclado.nextDouble());
                    teclado.nextLine();

                    arquivo.inserir(produto);
                    break;
                case 2:
                    ArrayList<Produto> produtos = arquivo.listar();
                    System.out.println("====================");
                    System.out.println("Listagem de Produtos");
                    System.out.println("====================");
                    for (Produto prod : produtos) {

                        System.out.println(prod.getId() + "    " + prod.getNome() + "    R$" + prod.getPreco());
                        System.out.println("---------------------");
                    }
                    teclado.nextLine();
                    teclado.nextLine();
                    break;

                case 3:
                    System.out.println("Alterar Produto");
                    System.out.println("digite o id que você quer alterar");
                    int idAlterar = teclado.nextInt();
                    teclado.nextLine();

                    ArrayList<Produto> listaAlterar = arquivo.listar();
                    boolean achoualterar = true;

                    for (Produto prod : listaAlterar) {
                        if (prod.getId() == idAlterar) {
                            achoualterar = true;

                            System.out.println("Produto encontrado: " + prod.getNome());

                            System.out.print("Novo Nome: ");
                            prod.setNome(teclado.nextLine());

                            System.out.print("Novo Preço: ");
                            prod.setPreco(teclado.nextDouble());
                            teclado.nextLine();
                            break;
                        }
                    }

                    if (achoualterar) {
                        arquivo.AtualizarArquivo(listaAlterar);
                        System.out.println("Produto alterado com sucesso!");
                    } else {
                        System.out.println("Produto com ID " + idAlterar + " não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Deletar Produto");
                    System.out.print("Digite o ID do produto que deseja remover: ");
                    int idDeletar = teclado.nextInt();
                    teclado.nextLine();

                    ArrayList<Produto> listaDeletar = arquivo.listar();
                    boolean achouDeletar = false;

                    for (int i = 0; i < listaDeletar.size(); i++) {
                        if (listaDeletar.get(i).getId() == idDeletar) {
                            listaDeletar.remove(i);
                            achouDeletar = true;
                            break;
                        }
                    }

                    if (achouDeletar) {
                        arquivo.AtualizarArquivo(listaDeletar);
                        System.out.println("Produto deletado com sucesso!");
                    } else {
                        System.out.println("Produto com ID " + idDeletar + " não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Adeus ai meu parceiro");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (op != 5);

    }
}