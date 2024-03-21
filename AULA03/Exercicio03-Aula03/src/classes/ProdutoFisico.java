
package classes;

/**
 *
 * @author aluno
 */
public class ProdutoFisico extends Produto{
    private double custoEnvio;

    public ProdutoFisico(double custoEnvio, double preco) {
        super(preco);
        this.custoEnvio = custoEnvio;
    }
    
    public double calcularPrecoFinal(){
        return preco + custoEnvio; 
    }
}


