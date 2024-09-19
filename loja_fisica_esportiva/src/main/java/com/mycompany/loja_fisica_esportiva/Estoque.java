package com.mycompany.loja_fisica_esportiva;

import java.util.ArrayList;

/**
 * A classe Estoque gerencia a lista de itens presentes no estoque da loja física esportiva.
 * Armazena e permite a manipulação de itens do tipo {@link ItemEstoque}.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Estoque {
    private ArrayList<ItemEstoque> itensEstoque;

    /**
     * Construtor da classe Estoque.
     * 
     * @param itensEstoque Lista inicial de itens de estoque.
     */
    public Estoque(ArrayList<ItemEstoque> itensEstoque) {
        this.itensEstoque = itensEstoque;
    }

    /**
     * Obtém a lista de itens no estoque.
     * 
     * @return Uma lista de {@link ItemEstoque} presentes no estoque.
     */
    public ArrayList<ItemEstoque> getItensEstoque() {
        return itensEstoque;
    }

    /**
     * Define a lista de itens no estoque.
     * 
     * @param itensEstoque A lista de {@link ItemEstoque} a ser definida.
     */
    public void setItensEstoque(ArrayList<ItemEstoque> itensEstoque) {
        this.itensEstoque = itensEstoque;
    }

    /**
     * Retorna uma representação em String dos itens no estoque.
     * 
     * @return Uma string representando a lista de itens no estoque.
     */
    @Override
    public String toString() {
        return "itensEstoque: " + itensEstoque;
    }
}
