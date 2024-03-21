package classes;

/**
 *
 * @author Carolina da Rosa Fagundes
 */
public class ContaCorrente {

    public static int qtdContas = 0;

    //atributos
    private String numero;
    private double saldo;
    private String nome;
    private String email;
    private String telefone;

    //metodos
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Voce deposito: R$" + valor + " Saldo atualizado: R$" + this.saldo);
    }

    public void sacar(double valor) {
        if (valor < saldo) {
            this.saldo = this.saldo - valor;
            System.out.println("Voce retirou dinheiro: R$" + valor + " Saldo atualizado: R$" + this.saldo);
        } else {
            System.out.println("Tentativa de saque: R$" + valor);
            System.out.print("Saldo insuficiente, valor disponivel: R$" + this.saldo);
        }
    }

    public void verSaldo() {
        System.out.println("O saldo atual e de: " + this.saldo);
    }

    //getters and setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //TO STRING
    public ContaCorrente() {
        //CONSTRUTOR VAZIO
        //incrimentando o valor das contas//
        qtdContas++;
        System.out.println(" ");
        System.out.println("///////-> Numero de contas: " + qtdContas);
    }

    public ContaCorrente(String numero, double saldo, String nome, String email, String telefone) {
        
        //este this incrementa no numero de contas
        this();
        this.numero = numero;
        this.saldo = saldo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        //CONSTRUTUTOR COM TODOS OS PARAMETROS
    }

    public ContaCorrente(String numero, double saldo, String nome, String email) {
        //encadeamento de contrutores
        
        this(numero, saldo, nome, email, " ");
        //CONSTRUTUTOR SEM TELEFONE
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "numero=" + numero + ", saldo=" + saldo + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + '}';
    }

    //EQUALS
    @Override
    public boolean equals(Object obj) {
        //comparando o to string da classe com o to string do objeto passado como parametro//
        return this.toString().equals(obj.toString());
    }

}
