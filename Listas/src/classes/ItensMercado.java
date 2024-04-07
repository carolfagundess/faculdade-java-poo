
package classes;

/**
 *
 * @author herrmann
 */
public class ItensMercado implements Comparable<ItensMercado>{

    private String nome;
    private double quantidade;
    private CategoriaItemMercado categoria;

    public ItensMercado(String nome, double quantidade, CategoriaItemMercado categoria) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public CategoriaItemMercado getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaItemMercado categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ItensMercado{" + "nome=" + nome + ", quantidade=" + quantidade + ", categoria=" + categoria.getCategoriaNome() + "}\n";
    }

    @Override
    public int compareTo(ItensMercado o) {
       return nome.compareTo(o.nome);
    }
    
    

}
