
package classes;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author carol
 */
public class Fila<T> {
    private List<T> elementos;

    public Fila() {
        elementos = new LinkedList<>();
    }

    public void enfileirar(T elemento){
        elementos.addLast(elemento);
    }
    
    public T desinfilerar(){
        return elementos.removeFirst();
    }
    
    public int tamanho(){
        return elementos.size();
    }
}
