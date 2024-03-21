/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author aluno
 */
public class Retangulo extends FiguraGeometrica{
    private int altura;
    private int largura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public Retangulo(int altura, int largura, String cor) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Retangulo{" + "altura=" + altura + ", largura=" + largura + '}';
    }
    
    @Override
    public double getArea(){
        return altura*largura;
    }
    
    @Override
    public void desenhar(){
        System.out.println("Retangulo de cor: " + getCor() + ", com altura " + getAltura() + " e largura " + getLargura());
    }
}
