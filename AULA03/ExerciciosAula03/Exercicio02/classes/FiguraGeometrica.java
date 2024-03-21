
package classes;

/**
 *
 * @author aluno
 */
public abstract class FiguraGeometrica {
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "cor=" + cor + '}';
    }
    
    //assinatura dos métodos
    public abstract double getArea();
    public abstract void desenhar();
}
