package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.Produto;

public class ArquivoProdutoCSV {
    private String nomeArquivo = "produtos.csv";

    public void inserir(Produto produto) {
        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);// cria arquivo ou acrescenta - false cria o arquivo
                                                                   // vazio
            PrintWriter escritor = new PrintWriter(arquivo);
            escritor.println(produto.getId() + "," + produto.getNome() + "," + produto.getPreco());
            escritor.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo " + e.getMessage());
        }

    }

    public ArrayList<Produto> listar() {
        ArrayList<Produto> produtos = new ArrayList<>();
        File arquivo = new File(nomeArquivo);
        // se não existe arquivo em disco é porque não há produtos cadastrados
        if (!arquivo.exists()) {
            return produtos;
        }
        // try with resources - neste caso o leitor.close() fica implícito
        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha = leitor.readLine();
            while (linha != null) {
                String[] dados = linha.split(",");
                Produto produto = new Produto();
                produto.setId(Integer.parseInt(dados[0]));
                produto.setNome(dados[1]);
                produto.setPreco(Double.parseDouble(dados[2]));
                produtos.add(produto);
                linha = leitor.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro ao acessar arquivo " + e.getMessage());
        }

        return produtos;
    }

    public void AtualizarArquivo(ArrayList<Produto> Novalista) {

        try {
            FileWriter arquivo = new FileWriter(nomeArquivo, true);
            PrintWriter escritor = new PrintWriter(arquivo);

            for (Produto produto : Novalista) {
                escritor.println(produto.getId() + "," + produto.getNome() + "," + produto.getPreco());
            }
        } catch (IOException e) {
            System.out.println("Erro ao tentar atualizar arquivo " + e.getMessage());
        }

    }

}