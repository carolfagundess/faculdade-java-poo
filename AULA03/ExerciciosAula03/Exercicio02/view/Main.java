/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import classes.Circulo;
import classes.Retangulo;
import classes.Trinagulo;

/**
 *
 * @author aluno
 */
public class Main {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(7, "Preta");
        Retangulo retangulo1 = new Retangulo(5, 6, "Laranja");
        Trinagulo triangulo1 = new Trinagulo(8, 7, "Azul");

        System.out.println(circulo1);
        System.out.println("Area: " + circulo1.getArea());
        circulo1.desenhar();
        
        System.out.println(triangulo1);
        System.out.println("Area: " + triangulo1.getArea());
        triangulo1.desenhar();
        
        System.out.println(retangulo1);
        System.out.println("Area: " + retangulo1.getArea());
        retangulo1.desenhar();
    }
}
