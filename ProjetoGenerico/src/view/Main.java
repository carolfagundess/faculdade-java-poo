/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import classes.Fila;

/**
 *
 * @author carol
 */
public class Main {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        Fila<String> fila2 = new Fila<>();
        
        fila.enfileirar(10);
        fila.enfileirar(40);
        fila.enfileirar(5);
        System.out.println("Tamanho: " + fila.tamanho());
        
        System.out.println("Desinfileirando: " + fila.desinfilerar());
        System.out.println("Desinfileirando: " + fila.desinfilerar());
    }
}
