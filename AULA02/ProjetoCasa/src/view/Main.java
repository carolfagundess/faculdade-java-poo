package view;

import classes.Casa;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        Casa casaAmarela = new Casa("Amarela");
        //imprimindo a cor da casa
        System.out.println(casaAmarela.getCor());
        
        Casa outraCasa = casaAmarela;
        //imprimindo a outra casa
        System.out.println(outraCasa.getCor());
        
        //alterando a cor da outra casa
        outraCasa.setCor("Azul");
        System.out.println(casaAmarela.getCor());
        System.out.println(outraCasa.getCor());
    }
}
