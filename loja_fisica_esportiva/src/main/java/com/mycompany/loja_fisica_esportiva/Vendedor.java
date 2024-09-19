package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Vendedor representa um funcionário da loja responsável pela venda de produtos e gestão de clientes.
 * Herda da classe {@link Funcionario} e adiciona a funcionalidade de comissão sobre vendas.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Vendedor extends Funcionario {
    private double percentualComissao;

    /**
     * Construtor da classe Vendedor.
     * 
     * @param id Identificador único do vendedor.
     * @param nome Nome do vendedor.
     * @param idade Idade do vendedor.
     * @param telefone Telefone de contato do vendedor.
     * @param email Email do vendedor.
     * @param turno Turno de trabalho do vendedor.
     * @param salario Salário do vendedor.
     * @param senha Senha do vendedor.
     * @param percentualComissao Percentual de comissão do vendedor, deve estar entre 0 e 100.
     * @throws IllegalArgumentException Se o percentualComissao estiver fora do intervalo permitido (0 a 100).
     */
    public Vendedor(int id, String nome, int idade, String telefone, String email, String turno, double salario, String senha, double percentualComissao) {
        super(id, nome, idade, telefone, email, turno, salario, senha);
        if (percentualComissao < 0 || percentualComissao > 100) {
            throw new IllegalArgumentException("Percentual de comissão deve estar entre 0 e 100.");
        }
        this.percentualComissao = percentualComissao;
    }

    /**
     * Obtém o percentual de comissão do vendedor.
     * 
     * @return O percentual de comissão.
     */
    public double getPercentualComissao() {
        return percentualComissao;
    }

    /**
     * Define o percentual de comissão do vendedor.
     * 
     * @param percentualComissao O percentual de comissão a ser definido.
     */
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    /**
     * Cadastra um cliente na loja.
     * 
     * @param cliente O cliente a ser cadastrado.
     * @return Sempre retorna true (indica que o cadastro foi realizado com sucesso).
     */
    public boolean cadastrarCliente(Cliente cliente) {
        System.out.println("Vendedor cadastrando cliente");
        return true;
    }

    /**
     * Verifica os dados de um cliente.
     * 
     * @param cliente O cliente cujos dados serão verificados.
     * @return Sempre retorna true (indica que a verificação foi realizada com sucesso).
     */
    public boolean verificarCliente(Cliente cliente) {
        System.out.println("Vendedor verificando dados do cliente");
        return true;
    }

    /**
     * Exclui um cliente da loja.
     * 
     * @param cliente O cliente a ser excluído.
     * @return Sempre retorna true (indica que a exclusão foi realizada com sucesso).
     */
    public boolean excluirCliente(Cliente cliente) {
        System.out.println("Vendedor excluindo dados do cliente");
        return true;
    }

    /**
     * Atualiza os dados de um cliente.
     * 
     * @param cliente O cliente cujos dados serão atualizados.
     * @return Sempre retorna true (indica que a atualização foi realizada com sucesso).
     */
    public boolean atualizarCliente(Cliente cliente) {
        System.out.println("Vendedor atualizando dados do cliente");
        return true;
    }

    /**
     * Aplica um desconto sobre o preço total de um pedido, baseado no percentual de comissão do vendedor.
     * 
     * @param pedido O pedido sobre o qual o desconto será aplicado.
     * @return O valor do desconto aplicado.
     */
    public double aplicarDesconto(Pedido pedido) {
        double precoTotal = pedido.calcularPrecoTotal();
        double desconto = precoTotal * (percentualComissao / 100.0);
        System.out.println("Vendedor aplicando desconto de " + desconto);
        return desconto;
    }

    /**
     * Retorna uma representação em String dos dados deste vendedor.
     * 
     * @return Uma string com o id, nome, idade, telefone, email, percentual de comissão, turno, salário e senha do vendedor.
     */
    @Override
    public String toString() {
        return "id: " + getId() + "\n" +
               "nome: " + getNome() + "\n" +
               "idade: " + getIdade() + "\n" +
               "telefone: " + getTelefone() + "\n" +
               "email: " + getEmail() + "\n" +
               "Percentual de comissão: " + getPercentualComissao() + "\n" +
               "turno: " + getTurno() + "\n" +
               "salario: " + getSalario() + "\n" +
               "senha: " + getSenha() + "\n";
    }
}
