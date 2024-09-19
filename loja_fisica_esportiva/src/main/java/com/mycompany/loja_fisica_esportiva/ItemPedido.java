package com.mycompany.loja_fisica_esportiva;

/**
 * A classe ItemPedido representa um item dentro de um pedido, associando um {@link Produto} a uma quantidade específica.
 * Fornece métodos para acessar e modificar o produto e a quantidade, além de calcular o preço total do item no pedido.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;

    /**
     * Construtor da classe ItemPedido.
     * 
     * @param produto O {@link Produto} associado a este item de pedido.
     * @param quantidade A quantidade deste produto no pedido.
     */
    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Obtém o produto associado a este item de pedido.
     * 
     * @return O {@link Produto} deste item de pedido.
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Define o produto associado a este item de pedido.
     * 
     * @param produto O {@link Produto} a ser definido.
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Obtém a quantidade deste produto no pedido.
     * 
     * @return A quantidade do produto.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade deste produto no pedido.
     * 
     * @param quantidade A quantidade a ser definida.
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Calcula o preço total deste item no pedido.
     * O preço é obtido do {@link Produto} e multiplicado pela quantidade.
     * 
     * @return O preço total do item no pedido.
     */
    public double calcularPrecoItemPedido() {
        System.out.println("Calculando preço do item pedido");
        double precoUnitario = produto.getPreco();
        return precoUnitario * quantidade;
    }

    /**
     * Retorna uma representação em String dos dados deste item de pedido.
     * 
     * @return Uma string com o produto e a quantidade do item de pedido.
     */
    @Override
    public String toString() {
        return "produto: " + produto + "\n" +
               "quantidade: " + quantidade;
    }
}
