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
        System.out.println("LISTA DE PESSOAS");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Nome: " + lista.get(i).getNome());
            System.out.println("Email: " + lista.get(i).getEmail());
            System.out.println("Telefone: " + lista.get(i).getTelefone());
        }
    }

    @Override
    public String toString() {
        return "ListaPessoa{" + "lista=" + lista + '}';
    }
}
