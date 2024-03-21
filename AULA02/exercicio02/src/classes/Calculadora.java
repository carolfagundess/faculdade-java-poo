/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Carolina da Rosa Fagundes
 */
public class Calculadora {

    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void SomarNumeros() {
        double resultado = (numero1+numero2);
        System.out.println("Soma: " + resultado);
    }

    public void SubtrairNumeros() {
        double resultado = (numero1-numero2);
        System.out.println("Subtração: " + resultado);
    }

    public void DividirNumeros() {
        if (numero1 != 0) {
            double resultado = (numero1/numero2);
            System.out.println("Divisão: " + resultado);
        } else {
            System.out.println("Qualquer numero dividido por zero é zero");
        }
    }

    public void MultiplicarNumeros() {
        double resultado = (numero1*numero2);
        System.out.println("Multiplicação: " + resultado);
    }
}
