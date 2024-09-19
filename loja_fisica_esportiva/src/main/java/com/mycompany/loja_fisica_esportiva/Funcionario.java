package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Funcionario representa um funcionário da loja física esportiva, que herda de {@link Pessoa}.
 * É uma classe abstrata, que serve como base para diferentes tipos de funcionários,no caso temos, vendedor e administrador 
 * com atributos como turno, salário e senha.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public abstract class Funcionario extends Pessoa {
    private String turno;
    private double salario;
    private String senha;

    /**
     * Construtor da classe Funcionario.
     * 
     * @param id Identificador único do funcionário.
     * @param nome Nome do funcionário.
     * @param idade Idade do funcionário.
     * @param telefone Telefone de contato do funcionário.
     * @param email Email do funcionário.
     * @param turno Turno de trabalho do funcionário.
     * @param salario Salário do funcionário.
     * @param senha Senha de acesso do funcionário.
     */
    public Funcionario(int id, String nome, int idade, String telefone, String email, String turno, double salario, String senha) {
        super(id, nome, idade, telefone, email);
        this.turno = turno;
        this.salario = salario;
        this.senha = senha;
    }

    /**
     * Obtém o turno de trabalho do funcionário.
     * 
     * @return O turno do funcionário.
     */
    public String getTurno() {
        return turno;
    }

    /**
     * Define o turno de trabalho do funcionário.
     * 
     * @param turno O turno a ser definido.
     */
    public void setTurno(String turno) {
        this.turno = turno;
    }

    /**
     * Obtém o salário do funcionário.
     * 
     * @return O salário do funcionário.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salario O salário a ser definido.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Obtém a senha de acesso do funcionário.
     * 
     * @return A senha do funcionário.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha de acesso do funcionário.
     * 
     * @param senha A senha a ser definida.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Retorna uma representação em String dos dados do funcionário.
     * 
     * @return Uma string com os dados do funcionário, como turno, salário, senha, id, nome, idade, telefone e email.
     */
    @Override
    public String toString() {
        return 
                "turno: " + turno +  "\n"  +
                "salario: " + salario +  "\n" +
                "senha: " + senha +  "\n"  +
                "id: " + getId() +  "\n" +
                "nome: " + getNome() +  "\n"  +
                "idade: " + getIdade() +  "\n" +
                "telefone: " + getTelefone() +  "\n"  +
                "email: " + getEmail();
    }
}
