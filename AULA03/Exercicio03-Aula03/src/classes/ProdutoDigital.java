
package classes;

/**
 *
 * @author aluno
 */
public class ProdutoDigital extends Produto{

    public ProdutoDigital(double preco) {
        super(preco);
    }
    
    public double calcularPrecoFinal(){
        return preco;
    }
}
