package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class LojaOnline {

    private List<Produto> produtos;

    //construtor vazio
    public LojaOnline() {
        produtos = new ArrayList<>();
    }

    //construtor com uma lista de produtos
    public LojaOnline(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularPrecoFinal() {
        double valorFinal = 0;
        for (int i = 0; i < produtos.size(); i++) {
            valorFinal += produtos.get(i).calcularPrecoFinal();
        }
        return valorFinal;
    }

}
