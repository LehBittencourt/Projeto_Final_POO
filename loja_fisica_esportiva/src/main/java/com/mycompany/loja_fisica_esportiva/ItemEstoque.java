package com.mycompany.loja_fisica_esportiva;

/**
 * A classe ItemEstoque representa um item no estoque da loja, associando um {@link Produto} a uma quantidade.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class ItemEstoque {
    private Produto produto;
    private int quantidade;

    /**
     * Construtor da classe ItemEstoque.
     * 
     * @param produto O {@link Produto} associado a este item de estoque.
     * @param quantidade A quantidade disponível deste produto no estoque.
     */
    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Obtém o produto associado a este item de estoque.
     * 
     * @return O {@link Produto} deste item de estoque.
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Define o produto associado a este item de estoque.
     * 
     * @param produto O {@link Produto} a ser definido.
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * Obtém a quantidade disponível deste produto no estoque.
     * 
     * @return A quantidade disponível.
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade disponível deste produto no estoque.
     * Se a quantidade fornecida for negativa, uma mensagem será impressa e a quantidade não será atualizada.
     * 
     * @param quantidade A quantidade a ser definida.
     */
    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade não pode ser negativa.");
        } else {
            this.quantidade = quantidade;
        }
    }

    /**
     * Retorna uma representação em String dos dados deste item de estoque.
     * 
     * @return Uma string com o produto e a quantidade disponíveis.
     */
    @Override
    public String toString() {
        return "produto: " + produto.toString() + "\n" +
               "quantidade: " + quantidade;
    }
}
