/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.Comparator;

/**
 *
 * @author carol
 */
public class ItensMercadoQtdComparator implements Comparator<ItensMercado> {

    @Override
    public int compare(ItensMercado o1, ItensMercado o2) {
       return (int) (o1.getQuantidade() - o2.getQuantidade());
    }
    
}
