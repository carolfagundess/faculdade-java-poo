package classes;

/**
 *
 * @author Carolina da Rosa Fagundes
 */
public class Pessoa {
    
    private String primeiroNome;
    private String segundoNome;
    private int idade;

    public Pessoa(String primeiroNome, String segundoNome, int idade) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idade = idade;
    }
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }  
    
    public boolean eAdolescente(){
        return (idade>12 && idade<18);    
    }
    
    public void imprimirNomeCompleto(){
        System.out.println(primeiroNome + " " +segundoNome);
    }
}