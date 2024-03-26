/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;
import static view.Main.mostrarMenu;

/**
 *
 * @author carol
 * @param <Pessoas>
 */
public class ListaPessoa<Pessoas> {
    
    Scanner scann = new Scanner(System.in);
    
    private final LinkedList<Pessoa> lista = new LinkedList<>();

    public ListaPessoa() {
    }

        public void adicionarPessoa() {
        System.out.println();
        System.out.println("\n1 - ADICIONAR PESSOA");
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

        lista.add(new Pessoa(nome, email, telefone, dataConvertida));
        System.out.println("Pessoa adicionada com sucesso!");
        System.out.println("--------------------------");
        mostrarMenu();
    }

    public void removerPessoa() {
        System.out.println("------------------");
        System.out.println("\n2 - REMOVER PESSOA");
        scann.nextLine();
        System.out.print("Digite o nome da pessoa que deseja remover: ");
        String nome = scann.nextLine();
        Pessoa pessoaBuscada = new Pessoa(nome);
        System.out.println("----DADOS DA PESSOA-----");
        mostrarDadosPessoa(retornarIndicePorNome(pessoaBuscada));
        if (retornarIndicePorNome(pessoaBuscada) != -1) {
            lista.remove(retornarIndicePorNome(pessoaBuscada));
            System.out.println("Pessoa removida com sucesso");
        } else {
            System.out.println("Não foi possivel remover");
        }
        System.out.println("-------------------------------");
        mostrarMenu();
    }

    public void exibirPessoas() {
        System.out.println("----------------------------");
        System.out.println("\n 3 - LISTA DE PESSOAS");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Cadastro numero: " + (1 + i));
            mostrarDadosPessoa(i);
        }
        mostrarMenu();
    }

    public void exibirInformacoes() {
        scann.nextLine(); // Limpa o buffer do scanner
        System.out.println("---------------------------------");
        System.out.println("4 - FERRAMENTA DE PESQUISA DE CADASTRO");
        System.out.print("Digite o nome da pessoa que deseja buscar: ");
        String nome = scann.nextLine();
        Pessoa pessoaBuscada = new Pessoa(nome);
        System.out.println("\n----DADOS DA PESSOA-----");
        mostrarDadosPessoa(retornarIndicePorNome(pessoaBuscada));
        mostrarMenu();
    }

    //Funções auxiliares para realização das funções principais
    public void mostrarDadosPessoa(int indice) {
        System.out.println("Indice da pessoa na lista: " + indice);
        if (indice != -1) {
            System.out.println("Nome: " + lista.get(indice).getNome());
            System.out.println("Email: " + lista.get(indice).getEmail());
            System.out.println("Telefone: " + lista.get(indice).getTelefone());
            System.out.println("Data de Nascimento: " + lista.get(indice).getDataNascimento());
            System.out.println();
        } else {
            System.out.println("Esta pessoa não consta na lista");
        }
        System.out.println("Mostrar dados nao esta funcionando");
    }

    public int retornarIndicePorNome(Pessoa pessoaBuscada) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getNome().equals(pessoaBuscada.getNome())) {
                return lista.indexOf(pessoa);
            }
        }
        return -1;
    }

    public LocalDate converterDataNascimento(String dataFornecida) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataFornecida, formatter);
        return dataNascimento;
    } 
}
