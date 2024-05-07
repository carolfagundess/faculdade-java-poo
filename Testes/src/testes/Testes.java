package testes;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author carol
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        
        numeros.add(10);
        numeros.add(90);
        numeros.add(14);
        numeros.add(12);
        numeros.add(13);
        numeros.add(null);
        numeros.add(10);
        System.out.println(numeros);
    }
}
