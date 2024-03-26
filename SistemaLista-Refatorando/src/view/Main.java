package view;

import classes.ListaPessoa;
import classes.Pessoa;
import java.util.Scanner;

/*import java.util.Scanner;*/
/**
 *
 * @author carol
 */
public class Main {

    static Scanner scann = new Scanner(System.in);
    static ListaPessoa lista = new ListaPessoa();

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("Sistema de gerenciamento de pessoas");
        System.out.println();

        mostrarMenu();

        System.out.println("Programa encerrado");

    }

    public static void mostrarMenu() {
        System.out.println("-------<MENU DE OPCOES>---------");
        System.out.println("1 - Adicionar uma pessoa na lista;");
        System.out.println("2 - Imprimir lista");
//        System.out.println("2 - Remover pessoa da lista;");
//        System.out.println("3 - Exibir todas as pessoas;");
//        System.out.println("4 - Exibir informacoes extras");
//        System.out.println("OU");
//        System.out.println("5 - Encerrar o programa");
        System.out.println("----------------------");
        System.out.print("Escolha uma opcao: ");
        int opcao = lerOpcao();
        executarOpcao(opcao);
    }

    public static int lerOpcao() {
        try {
            return scann.nextInt();
        } catch (Exception e) {
            System.out.println("Opcao invalida. Por favor, insira um numero.");
            scann.nextLine(); // Limpa o buffer do scanner
            return lerOpcao(); // Repete a leitura da opção
        }
    }

    public static void adicionarPessoa() {
        System.out.println();
        System.out.println("\n1 - ADICIONAR PESSOA");
        scann.nextLine(); // Limpa o buffer do scanner
        System.out.print("Informe um nome: ");
        String nome = scann.nextLine();
        System.out.print("Informar um email: ");
        String email = scann.nextLine();
        System.out.print("Informar um telefone: ");
        String telefone = scann.nextLine();
        Pessoa pessoa = new Pessoa(nome, email, telefone);
        lista.adicionarPessoa(pessoa);
        mostrarMenu();
    }
    
    public static void mostrarLista(){
        lista.imprimirLista();
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 ->
                adicionarPessoa();
            case 2 ->
                mostrarLista();
            default -> {
                System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                mostrarMenu(); // Volta ao menu principal
            }
        }
    }
}
