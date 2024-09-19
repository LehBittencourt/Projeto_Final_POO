package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Cliente representa um cliente da loja física esportiva, herda de Pessoa e 
 * contém informações adicionais como endereço e numeração de sapato. 
 * O cliente pode selecionar produtos, adicionar itens a um pedido, solicitar trocas ou devoluções.
 * 
 * @see Pessoa
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Cliente extends Pessoa {
    private String endereco;
    private int numeracaoSapato;

    /**
     * Construtor da classe Cliente.
     * 
     * @param id Identificador único do cliente.
     * @param nome Nome do cliente.
     * @param idade Idade do cliente.
     * @param telefone Telefone de contato do cliente.
     * @param email Email do cliente.
     * @param endereco Endereço residencial do cliente.
     * @param numeracaoSapato Numeração de sapato do cliente.
     */
    public Cliente(int id, String nome, int idade, String telefone, String email, String endereco, int numeracaoSapato) {
        super(id, nome, idade, telefone, email);
        this.endereco = endereco;
        this.numeracaoSapato = numeracaoSapato;
    }

    /**
     * Obtém o endereço do cliente.
     * 
     * @return O endereço do cliente.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do cliente.
     * 
     * @param endereco O endereço a ser definido.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Obtém a numeração de sapato do cliente.
     * 
     * @return A numeração de sapato.
     */
    public int getNumeracaoSapato() {
        return numeracaoSapato;
    }

    /**
     * Define a numeração de sapato do cliente.
     * 
     * @param numeracaoSapato A numeração de sapato a ser definida.
     */
    public void setNumeracaoSapato(int numeracaoSapato) {
        this.numeracaoSapato = numeracaoSapato;
    }

    /**
     * Simula o cliente selecionando um produto.
     */
    public void selecionarProduto() {
        System.out.println("Cliente selecionando produto");
    }

    /**
     * Adiciona um item ao pedido do cliente.
     * 
     * @return true se o item foi adicionado com sucesso.
     */
    public boolean adicionarItemPedido() {
        System.out.println("Cliente adicionando item ao pedido");
        return true;
    }

    /**
     * Solicita uma troca de um pedido.
     * 
     * @param pedido O pedido correspondente quando a troca é solicitada.
     * @return true se a solicitação de troca foi bem-sucedida.
     */
    public boolean solicitarTroca(Pedido pedido) {
        System.out.println("Cliente solicitou troca");
        return true;
    }

    /**
     * Solicita a devolução de um pedido.
     * 
     * @param pedido O pedido correspondente quando a devolução é solicitada.
     * @return true se a solicitação de devolução foi bem-sucedida.
     */
    public boolean solicitarDevolucao(Pedido pedido) {
        System.out.println("Cliente solicitou devolução do pedido");
        return true;
    }

    /**
     * Retorna uma representação em String dos dados do cliente.
     * 
     * @return Uma string com os dados do cliente, como id, nome, idade, telefone, email, endereço e numeração de sapato.
     */
    @Override
    public String toString() {
        return 
                "id: " + getId()  + "\n" +
                "nome: " + getNome() + "\n" +
                "idade: " + getIdade() + "\n" +
                "telefone: " + getTelefone() + "\n" +
                "email: " + getEmail() + "\n" +
                "endereco: " + endereco + "\n" +
                "numeracaoSapato: " + numeracaoSapato;
    }
}
