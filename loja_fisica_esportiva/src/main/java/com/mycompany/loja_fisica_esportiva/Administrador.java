package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Administrador herda de Funcionario e representa um administrador 
 * que possui permissões diferentes para gerenciar estoque e vendedores.
 * Esta classe inclui métodos para inserir, atualizar, remover e consultar itens no estoque, 
 * além de contratar, consultar, atualizar e demitir vendedores.
 * 
 * @see Funcionario
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Administrador extends Funcionario {
    private String nivelPermissao;

    /**
     * Construtor da classe Administrador.
     * 
     * @param id Identificador do administrador.
     * @param nome Nome do administrador.
     * @param idade Idade do administrador.
     * @param telefone Telefone do administrador.
     * @param email Email do administrador.
     * @param turno Turno de trabalho do administrador.
     * @param salario Salário do administrador.
     * @param senha Senha de acesso do administrador.
     * @param nivelPermissao Nível de permissão do administrador.
     */
    public Administrador(int id, String nome, int idade, String telefone, String email, String turno, double salario, String senha, String nivelPermissao) {
        super(id, nome, idade, telefone, email, turno, salario, senha);
        this.nivelPermissao = nivelPermissao;
    }

    public String getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(String nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

    /**
     * Insere um item no estoque.
     * 
     * @param itemEstoque O item a ser inserido.
     * @return true se o item foi inserido com sucesso.
     */
    public boolean inserirItemEstoque(ItemEstoque itemEstoque) {
        System.out.println("Inserindo item ao estoque");
        // Implementar lógica de inserção
        return true; 
    }

    /**
     * Atualiza as informações de um item no estoque.
     * 
     * @param itemEstoque O item a ser atualizado.
     * @return true se o item foi atualizado com sucesso.
     */
    public boolean atualizarItemEstoque(ItemEstoque itemEstoque) {
        System.out.println("Atualizando item do estoque");
        // Implementar lógica de atualização
        return true; 
    }

    /**
     * Remove um item do estoque.
     * 
     * @param itemEstoque O item a ser removido.
     * @return true se o item foi removido com sucesso.
     */
    public boolean removerItemEstoque(ItemEstoque itemEstoque) {
        System.out.println("Removendo item do estoque");
        // Implementar lógica de remoção
        return true;
    }

    /**
     * Consulta um item no estoque.
     * 
     * @param itemEstoque O item a ser consultado.
     * @return true se o item foi encontrado.
     */
    public boolean consultarItemEstoque(ItemEstoque itemEstoque) {
        System.out.println("Consultando item do estoque");
        return true;
    }

    /**
     * Contrata um novo vendedor.
     * 
     * @param vendedor O vendedor a ser contratado.
     * @return true se a contratação for bem-sucedida.
     */
    public boolean contratarVendedor(Vendedor vendedor) {
        System.out.println("Contratando vendedor");
        return true;
    }

    /**
     * Consulta as informações de um vendedor.
     * 
     * @param vendedor O vendedor a ser consultado.
     * @return true se o vendedor foi encontrado.
     */
    public boolean consultarVendedor(Vendedor vendedor) {
        System.out.println("Consultando vendedor");
        return true;
    }

    /**
     * Atualiza as informações de um vendedor.
     * 
     * @param vendedor O vendedor a ser atualizado.
     * @return true se a atualização for bem-sucedida.
     */
    public boolean atualizarVendedor(Vendedor vendedor) {
        System.out.println("Atualizando dados do vendedor");
        return true;
    }

    /**
     * Demite um vendedor.
     * 
     * @param vendedor O vendedor a ser demitido.
     * @return true se a demissão for bem-sucedida.
     */
    public boolean demitirVendedor(Vendedor vendedor) {
        System.out.println("Realizando demissão do vendedor");
        return true;
    }
}
