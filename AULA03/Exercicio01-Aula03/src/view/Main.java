
package view;

import classes.Bicicleta;
import classes.Carro;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Bicicleta bike1 = new Bicicleta();
        
        carro1.dirigir();
        bike1.dirigir();
    }
}
