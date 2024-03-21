
package classes;

/**
 *
 * @author aluno
 */
public abstract class Produto {
    protected double preco;

    public Produto(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Produto{" + "preco=" + preco + '}';
    }
    
    public abstract double calcularPrecoFinal();
}
