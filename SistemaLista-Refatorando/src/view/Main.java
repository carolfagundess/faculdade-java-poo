
package view;

import classes.ListaPessoa;
import java.util.Scanner;

/**
 *
 * @author carol
 */

public class Main {
    
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
        System.out.println("2 - Remover pessoa da lista;");
        System.out.println("3 - Exibir todas as pessoas;");
        System.out.println("4 - Exibir informacoes extras");
        System.out.println("OU");
        System.out.println("5 - Encerrar o programa");
        System.out.println("----------------------");
        System.out.print("Escolha uma opcao: ");
        int opcao = lerOpcao();
        executarOpcao(opcao);
    }

    public static int lerOpcao() {
        Scanner scann = new Scanner(System.in);
        try {
            return scann.nextInt();
        } catch (Exception e) {
            System.out.println("Opcao invalida. Por favor, insira um numero.");
            scann.nextLine(); // Limpa o buffer do scanner
            return lerOpcao(); // Repete a leitura da opção
        }
    }

    public static void executarOpcao(int opcao) {
        ListaPessoa listaPessoa = new ListaPessoa();
        switch (opcao) {
            case 1 ->
                listaPessoa.adicionarPessoa();
            case 2 ->
                listaPessoa.removerPessoa();
            case 3 ->
                listaPessoa.exibirPessoas();
            case 4 ->
                listaPessoa.exibirInformacoes();
            case 5 -> {
            }
            default -> {
                System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                mostrarMenu();
            }
        }
    }
}
