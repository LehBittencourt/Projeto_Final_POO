package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Produto representa um item disponível para venda na loja, com informações sobre seu identificador, nome, descrição, categoria e preço.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Produto {
    private int idProduto;
    private String nome;
    private String descricao;
    private String categoria;
    private double preco;
    
    /**
     * Construtor da classe Produto.
     * 
     * @param idProduto Identificador único do produto.
     * @param nome Nome do produto.
     * @param descricao Descrição do produto.
     * @param categoria Categoria à qual o produto pertence.
     * @param preco Preço do produto.
     */
    public Produto(int idProduto, String nome, String descricao, String categoria, double preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
    }

    /**
     * Obtém o identificador único do produto.
     * 
     * @return O id do produto.
     */
    public int getIdProduto() {
        return idProduto;
    }

    /**
     * Define o identificador único do produto.
     * 
     * @param idProduto O id do produto a ser definido.
     */
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * Obtém o nome do produto.
     * 
     * @return O nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do produto.
     * 
     * @param nome O nome do produto a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a descrição do produto.
     * 
     * @return A descrição do produto.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do produto.
     * 
     * @param descricao A descrição do produto a ser definida.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtém a categoria do produto.
     * 
     * @return A categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a categoria do produto.
     * 
     * @param categoria A categoria do produto a ser definida.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtém o preço do produto.
     * 
     * @return O preço do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Define o preço do produto.
     * 
     * @param preco O preço do produto a ser definido.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    /**
     * Retorna uma representação em String dos dados deste produto.
     * 
     * @return Uma string com o idProduto, nome, descrição, categoria e preço do produto.
     */
    @Override
    public String toString() {
        return "idProduto: " + idProduto + "\n" +
               "nome: " + nome + "\n" +
               "descricao: " + descricao + "\n" +
               "categoria: " + categoria + "\n" +
               "preco: " + preco;
    }
}
