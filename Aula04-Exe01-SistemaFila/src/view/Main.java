/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import classes.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Main {

    static Scanner scann = new Scanner(System.in);
    static Queue<Pessoa> fila = new LinkedList<>();

    public static void main(String[] args) {
        System.out.println("Sistema de gerenciamento de Filas do Banco");
        System.out.println();
        mostrarMenu();

        scann.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n-------<MENU DE OPCOES>---------");
        System.out.println("1 - Adicionar uma pessoa na Fila;");
        System.out.println("2 - Chamar o proximo;");
        System.out.println("3 - Mostrar a fila");
        System.out.println("OU");
        System.out.println("4 - Encerrar o programa");
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

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1 ->
                adicionarPessoa();
            case 2 ->
                chamarProximo();
            case 3 ->
                exibirFila();
            case 4 -> {
            }
            default -> {
                System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                mostrarMenu(); // Volta ao menu principal
            }
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

        //testando se a data fornecida é valida
        LocalDate dataConvertida = null;
        boolean dataValida = false;
        do {
            try {
                System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
                String dataFornecida = scann.next();
                dataConvertida = converterDataNascimento(dataFornecida);
                //caso for valida, passa a ser true e sai do loop
                dataValida = true;
                //caso de um exception, informa o erro e limpa o buffer pra tentar novamente
            } catch (Exception e) {
                System.out.println("Data inválida. Por favor, tente novamente.");
                scann.nextLine(); // Limpar o buffer do scanner
            }
        } while (!dataValida);

        fila.offer(new Pessoa(nome, email, telefone, dataConvertida));
        System.out.println("Pessoa adicionada!");
        mostrarMenu();
    }

    public static void chamarProximo() {
        System.out.println("Proximo da fila: " + fila.poll());
        mostrarMenu();
    }

    public static void exibirFila() {
        System.out.println("Pessoas da fila: ");
        System.out.println();
        for (Pessoa elemento : fila) {
            System.out.println(elemento);
        }
        mostrarMenu();
    }

    public static LocalDate converterDataNascimento(String dataFornecida) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataFornecida, formatter);
        return dataNascimento;
    }
}
