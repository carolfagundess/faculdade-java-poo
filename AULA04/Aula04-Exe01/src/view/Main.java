package view;

import classes.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Carolina Fagundes LPII - Venancio Aires 2024
 */
public class Main {

    static Scanner scann = new Scanner(System.in);
    static LinkedList<Pessoa> listaPessoas = new LinkedList<>();

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        System.out.println("Sistema de gerenciamento de pessoas");
        System.out.println();

        mostrarMenu();
    }

    public static void mostrarMenu() {
        System.out.println("-------<MENU DE OPCOES>---------");
        System.out.println("1 - Adicionar uma pessoa na lista;");
        System.out.println("2 - Remover pessoa da lista;");
        System.out.println("3 - Exibir todas as pessoas;");
        System.out.println("4 - Exibir informacoes extras");
        System.out.println("5 - Encerrar o programa");
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
            return lerOpcao(); // Chama recursivamente para ler a opcao novamente
        }
    }

    public static void executarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                adicionarPessoa();
                break;
            case 2:
                removerPessoa();
                break;
            case 3:
                exibirPessoas();
                break;
            case 4:
                exibirInformacoes();
                break;
            case 5:
                break;
            default:
                System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                mostrarMenu(); // Volta ao menu principal
                break;
        }
    }

    public static void adicionarPessoa() {
        System.out.println();
        System.out.println("1 - ADICIONANDO PESSOA");
        scann.nextLine(); // Limpa o buffer do scanner
        System.out.print("Informe um nome: ");
        String nome = scann.nextLine();
        System.out.print("Informar um email: ");
        String email = scann.nextLine();
        System.out.print("Informar um telefone: ");
        String telefone = scann.nextLine();
        System.out.print("Informe a data de nascimento (dd/MM/yyyy): ");
        String dataFornecida = scann.next();
        LocalDate dataConvertida = converterDataNascimento(dataFornecida);
        listaPessoas.add(new Pessoa(nome, email, telefone, dataConvertida));
        System.out.println("Pessoa adicionada com sucesso!");
        System.out.println("--------------------------");
        mostrarMenu();
    }

    public static void removerPessoa() {

    }

    public static void exibirPessoas() {
        System.out.println("----------------------------");
        System.out.println("3 - LISTA DE PESSOAS");
        System.out.println();

        for (int i = 0; i < listaPessoas.size(); i++) {
            System.out.println("Cadastro numero: " + (1 + i));
            buscarPessoas(i);
        }
        mostrarMenu();
    }

    public static void buscarPessoas(int indice) {
        System.out.println("Nome: " + listaPessoas.get(indice).getNome());
        System.out.println("Email: " + listaPessoas.get(indice).getEmail());
        System.out.println("Telefone: " + listaPessoas.get(indice).getTelefone());
        System.out.println("Data de Nascimento: " + listaPessoas.get(indice).getDataNascimento());
        System.out.println();
    }

    public static void exibirInformacoes() {
        scann.nextLine(); // Limpa o buffer do scanner
        System.out.println("---------------------------------");
        System.out.println("4 - FERRAMENTA DE PESQUISA DE CADASTRO");
        System.out.println(listaPessoas.indexOf("carol@"));
        mostrarMenu();
    }

    public static LocalDate converterDataNascimento(String dataFornecida) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataFornecida, formatter);
        return dataNascimento;
    }

}
