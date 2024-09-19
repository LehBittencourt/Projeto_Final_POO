package com.mycompany.loja_fisica_esportiva;

import java.util.ArrayList;

/**
 * A classe Pedido representa um pedido feito por um {@link Cliente}, processado por um {@link Vendedor}.
 * O pedido contém uma lista de itens de pedido {@link ItemPedido} e a data em que foi realizado.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Pedido {
    private Cliente cliente;
    private Vendedor vendedor;
    private String data;
    private ArrayList<ItemPedido> itensPedidos;

    /**
     * Construtor da classe Pedido.
     * 
     * @param cliente O {@link Cliente} que fez o pedido.
     * @param vendedor O {@link Vendedor} que processou o pedido.
     * @param data A data em que o pedido foi realizado.
     * @param itensPedidos A lista de {@link ItemPedido} no pedido.
     */
    public Pedido(Cliente cliente, Vendedor vendedor, String data, ArrayList<ItemPedido> itensPedidos) {
        if (cliente == null || vendedor == null || data == null || itensPedidos == null) {
            throw new IllegalArgumentException("Cliente, vendedor, data e itensPedidos não podem ser nulos.");
        }
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.data = data;
        this.itensPedidos = itensPedidos;
    }

    /**
     * Obtém o cliente que fez o pedido.
     * 
     * @return O {@link Cliente} associado a este pedido.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente que fez o pedido.
     * 
     * @param cliente O {@link Cliente} a ser definido.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém o vendedor que processou o pedido.
     * 
     * @return O {@link Vendedor} que processou o pedido.
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * Define o vendedor que processou o pedido.
     * 
     * @param vendedor O {@link Vendedor} a ser definido.
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Obtém a data em que o pedido foi realizado.
     * 
     * @return A data do pedido.
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data em que o pedido foi realizado.
     * 
     * @param data A data a ser definida.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém a lista de itens do pedido.
     * 
     * @return A lista de {@link ItemPedido} no pedido.
     */
    public ArrayList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    /**
     * Define a lista de itens do pedido.
     * 
     * @param itensPedidos A lista de {@link ItemPedido} a ser definida.
     */
    public void setItensPedidos(ArrayList<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    /**
     * Calcula o preço total do pedido somando os preços de todos os itens.
     * 
     * @return O preço total do pedido.
     */
   public double calcularPrecoTotal() {
    double precoTotal = 0.0;
    for (ItemPedido item : itensPedidos) {
        precoTotal += item.calcularPrecoItemPedido(); 
    }
    return precoTotal;
}


    /**
     * Retorna uma representação em String dos dados deste pedido.
     * 
     * @return Uma string com o cliente, vendedor, data e lista de itens do pedido.
     */
    @Override
    public String toString() {
        return "cliente: " + cliente.toString() + "\n" +
               "vendedor: " + vendedor.toString() + "\n" + 
               "data: " + data + "\n" +
               "itensPedidos: " + itensPedidos.toString();
    }
}
