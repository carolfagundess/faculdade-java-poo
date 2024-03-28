package view;

import classes.ListaPessoa;
import classes.Pessoa;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        System.out.println("\n-------<MENU DE OPCOES>---------");
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
                removerPessoa();
            case 3 ->
                mostrarLista();
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

        Pessoa pessoa = new Pessoa(nome, email, telefone, dataConvertida);
        lista.adicionarPessoa(pessoa);
        System.out.println("\n Pessoa adicionado com sucesso!");
        mostrarMenu();
    }

    public static void mostrarLista() {
        lista.imprimirLista();
        mostrarMenu();
    }

    public static void removerPessoa() {
        scann.nextLine(); //limpando buffer
        System.out.println("Digite o nome da pessoa que deseja remover: ");
        String nome = scann.nextLine();
        Pessoa pessoaBuscada = new Pessoa(nome);
        lista.mostrarDadosPessoa(lista.retornarIndicePorNome(pessoaBuscada));
        System.out.println("\n REMOVENDO...");
        if (lista.retornarIndicePorNome(pessoaBuscada) != -1) {
            lista.removerPessoa(lista.retornaPessoaLista(lista.retornarIndicePorNome(pessoaBuscada)));
            System.out.println("Pessoa removida com sucesso");
        } else {
            System.out.println("Não foi possivel remover");
        }
        System.out.println("-------------------------------");
        mostrarMenu();
    }
    
        public static void exibirInformacoes() {
        scann.nextLine(); // Limpa o buffer do scanner
        System.out.println("---------------------------------");
        System.out.println("4 - FERRAMENTA DE PESQUISA DE CADASTRO");
        System.out.print("Digite o nome da pessoa que deseja buscar: ");
        String nome = scann.nextLine();
        Pessoa pessoaBuscada = new Pessoa(nome);
        lista.mostrarDadosPessoa(lista.retornarIndicePorNome(pessoaBuscada));
        mostrarMenu();
    }

    public static LocalDate converterDataNascimento(String dataFornecida) { 
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataFornecida, formatter);
        return dataNascimento;
    }
}
