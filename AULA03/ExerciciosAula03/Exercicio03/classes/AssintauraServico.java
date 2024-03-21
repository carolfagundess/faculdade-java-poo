
package classes;

/**
 *
 * @author aluno
 */
public class AssintauraServico extends Produto{
    private double taxaMensal;

    public AssintauraServico(double taxaMensal) {
        super(0);
        this.taxaMensal = taxaMensal;
    }
    
    public double calcularPrecoFinal(){
        return taxaMensal;
    }
}
