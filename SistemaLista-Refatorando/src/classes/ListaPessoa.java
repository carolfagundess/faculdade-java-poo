/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.LinkedList;

/**
 *
 * @author carol
 * @param <Pessoas>
 */
public class ListaPessoa<Pessoas> {

    private final LinkedList<Pessoa> lista = new LinkedList<>();

    public ListaPessoa() {
    }

    public void adicionarPessoa(Pessoa pessoa) {
        lista.add(pessoa);
    }

    public LinkedList<Pessoa> getLista() {
        return lista;
    }

    public void imprimirLista() {
        System.out.println("\n-----------LISTA DE PESSOAS------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Cadastro: " + (i + 1));
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Email: " + lista.get(i).getEmail());
            System.out.println("Telefone: " + lista.get(i).getTelefone());
            System.out.println();
        }
    }

    public void mostrarDadosPessoa(int indice) {
        System.out.println("\n----DADOS DA PESSOA-----");
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
    }

    public int retornarIndicePorNome(Pessoa pessoaBuscada) {
        for (Pessoa pessoa : lista) {
            if (pessoa.getNome().equals(pessoaBuscada.getNome())) {
                return lista.indexOf(pessoa);
            }
        }
        return -1;
    }

    public Pessoa retornaPessoaLista(int indice) {
        Pessoa pessoa = new Pessoa();
        pessoa = lista.get(indice);
        return pessoa;
    }

    public void removerPessoa(Pessoa pessoa) {
        lista.remove(pessoa);
    }

    @Override
    public String toString() {
        return "ListaPessoa{" + "lista=" + lista + '}';
    }
}
