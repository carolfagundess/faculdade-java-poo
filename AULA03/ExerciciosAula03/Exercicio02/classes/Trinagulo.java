/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author aluno
 */
public class Trinagulo extends FiguraGeometrica{
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Trinagulo(int base, int altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Trinagulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public double getArea(){
        double area = (base*altura)/2;
        return area;
    }
    
    public void desenhar(){
        System.out.println("Triangulo de cor: " + getCor() + ", com base " + getBase() + " e altura " + getAltura());
    }
    
}
