package exercicio02;

import classes.Calculadora;

// @author Carolina da Rosa Fagundes

public class Exercicio02 {

    public static void main(String[] args) {

        Calculadora teste1 = new Calculadora();
        Calculadora teste2 = new Calculadora();

        teste1.setNumero1(10.0);
        teste1.setNumero2(5.0);

        System.out.println("TESTE 1");
        //testes de operações
        System.out.println(teste1.getNumero1() + " e " + teste1.getNumero2());
        teste1.SomarNumeros();
        teste1.SubtrairNumeros();
        teste1.DividirNumeros();
        teste1.MultiplicarNumeros();

        teste2.setNumero1(0.0);
        teste2.setNumero2(10.0);

        System.out.println("TESTE 2");
        System.out.println(teste2.getNumero1() + " e " + teste2.getNumero2());
        teste2.SomarNumeros();
        teste2.SubtrairNumeros();
        teste2.DividirNumeros();
        teste2.MultiplicarNumeros();
    }
}
