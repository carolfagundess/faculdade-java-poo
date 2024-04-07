package testes;

import java.util.ArrayList;

/**
 *
 * @author carol
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ArrayList<Object> linha = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                linha.add(j);
            }
            lista.add(linha);
        }

        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                System.out.print(lista.get(j));
            }
        }
    }
}
