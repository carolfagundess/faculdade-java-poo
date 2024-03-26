/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import classes.CategoriaItemMercado;
import classes.ItensMercado;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;




/**
 *
 * @author herrmann
 */
public class Principal {
    public static void main(String[] args) {
        // Arrays
        String[] itens = new String[4];
        itens[0] = "Banana";
        itens[1] = "Tomate";
        itens[2] = "Maçã";
        itens[3] = "Arroz";
        System.out.println(Arrays.toString(itens));
        for (int y = 0; y < itens.length; y++) {
            System.out.print("Item "+y+": ");
            System.out.println(itens[y]);
        }
        // ordenando arrays
        Arrays.sort(itens);
        System.out.println(Arrays.toString(itens));
        
        System.out.println("===== TRABALHANDO COM LISTAS====");
        //O List.of transforma o Array num ArrayList e passa como 
        // parâmetro para o m,étodo construtor do ArrayList
        // com isso itens2 já terá todo o conteúdo do array itens
        List<String> itens2 = new ArrayList<>(List.of(itens));
        System.out.println(itens2);
        // adicionando o feijão na lsita
        itens2.add("Feijão");
        
        System.out.println(itens2);
        // existe tal item na lista?
        if (itens2.contains("Feijão")){
            System.out.println("Existe feijão na minha lista"); 
        }
        // retornando o indice onde está o Feijão
        System.out.println(itens2.indexOf("Feijão"));
        
        // Ordenar listas em ordem alfabética
        itens2.sort(Comparator.reverseOrder());
        System.out.println(itens2);
        
        // removendo item da lista
        itens2.remove("Feijão");
        System.out.println(itens2);
        
        //removendo + que 1 objeto, ou retendo 1 ou mais objetos
        itens2.removeAll(List.of("Maçã","Arroz"));
        System.out.println(itens2);
        itens2.retainAll(List.of("Banana"));
        System.out.println(itens2);
        //limpando a lista
        itens2.clear();
        System.out.println(itens2);
        // adicionando varios itens
        itens2.addAll(List.of("Farinha","Açúcar","Fermento","Leite","Ovos"));
        System.out.println(itens2);
        // adicionando um item entre acucar e fermento
        itens2.add(2,"Água");
        System.out.println(itens2);
        
        // percorrendo lista
        for (int i = 0; i < itens2.size(); i++) {
            System.out.print("Item "+i+": ");
            System.out.println(itens2.get(i));
        }
        for(String nome : itens2){
            System.out.print(nome+", ");
        }
        // Brincando com LINKEDLIST
        // var está disponível a partir do JAVA 10
        var lugaresVisitar = new LinkedList<>();
        lugaresVisitar.add("Mato Leitão");
        lugaresVisitar.add("Venâncio Aires");
        lugaresVisitar.add("Linha Herval");
        System.out.println("");
        System.out.println(lugaresVisitar);
        lugaresVisitar.addFirst("Passo do Sobrado");
        System.out.println(lugaresVisitar);
        
        System.out.println(lugaresVisitar.pop());
        
        // iterador e usado para percorrer a lista
        // inicialmente o iterador sempre aponta para 
        // uma posição antes da primeira
        System.out.println(lugaresVisitar);
        ListIterator it = lugaresVisitar.listIterator();
        try{
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.previous());
            System.out.println(it.next());
            System.out.println(it.next());
            System.out.println(it.next());// essa linha gera um erro
        }catch (Exception e){
            System.out.println("Você fez bobagem!");
            // o printstacktrace imprime todo o erro que aconteceu
            // mas o programa continua funcionando...
            e.printStackTrace();
        }
        
        System.out.println("Essa linha executa depois do erro");
        
        /// brincando com classes e listas
        List<ItensMercado> lista = new ArrayList<>();
        lista.add(new ItensMercado("Lápis",5,CategoriaItemMercado.PAPELARIA));
        lista.add(new ItensMercado("Escova de dente",2,CategoriaItemMercado.HIGIENE));
        System.out.println(lista);
        // somando as quantidades
        double qtd = 0;
        for (int i = 0; i < lista.size(); i++) {
            qtd += lista.get(i).getQuantidade();
        }
        System.out.println("A quantidade de itens é: "+qtd);
        
        qtd = 0;
        for (ItensMercado item : lista){
            if (item.getCategoria() == CategoriaItemMercado.HIGIENE){
                qtd += item.getQuantidade();
            }
        }
        System.out.println("A quantidade de itens é: "+qtd);
        
//        Scanner scan = new Scanner(System.in);
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        String texto = scan.nextLine();
//        LocalDate date = LocalDate.parse(texto, formatter);
//        System.out.println(date.format(formatter));
        
    }
}
