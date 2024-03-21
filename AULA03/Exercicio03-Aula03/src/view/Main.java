
package view;

import classes.AssintauraServico;
import classes.LojaOnline;
import classes.ProdutoDigital;
import classes.ProdutoFisico;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        ProdutoFisico livro = new ProdutoFisico(50, 10);
        ProdutoDigital musica = new ProdutoDigital(5);
        AssintauraServico streaming = new AssintauraServico(20);
        
        LojaOnline loja = new LojaOnline();
        
        loja.adicionarProduto(livro);
        loja.adicionarProduto(musica);
        loja.adicionarProduto(streaming);
        
        double precoTotal = loja.calcularPrecoFinal();
        System.out.println("Preco total de compra: R$ " + precoTotal);
    }
}
