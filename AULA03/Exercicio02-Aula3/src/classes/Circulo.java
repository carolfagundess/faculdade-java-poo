/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author aluno
 */
public class Circulo extends FiguraGeometrica{
    private int raio;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Circulo(int raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
    
    @Override
    public double getArea(){
        double area = 3.14*Math.pow(raio, 2);
        return area;
    }
    
    public void desenhar(){
        System.out.println("Circulo de cor: " + getCor() + ", com raio " + getRaio());
    }
}
