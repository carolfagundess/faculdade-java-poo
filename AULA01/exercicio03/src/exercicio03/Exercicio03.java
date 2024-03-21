package exercicio03;

import classes.Pessoa;

/**
 *
 * @author Carolina da Rosa Fagundes
 */
public class Exercicio03 {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos", "Souza", 19);
        Pessoa pessoa2 = new Pessoa("Mariana", "Oliveira", 16);

        System.out.println("Chamando metodos para pessoa1");
        pessoa1.imprimirNomeCompleto();
        System.out.println(pessoa1.eAdolescente());

        System.out.println("Chamando metodos para pessoa2");
        pessoa2.imprimirNomeCompleto();
        System.out.println(pessoa2.eAdolescente());
    }
}
