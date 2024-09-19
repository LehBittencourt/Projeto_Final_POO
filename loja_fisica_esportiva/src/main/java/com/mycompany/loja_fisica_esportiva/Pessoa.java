package com.mycompany.loja_fisica_esportiva;

/**
 * A classe Pessoa representa uma entidade com informações básicas como id, nome, idade, telefone e email.
 * É uma classe abstrata, servindo como base para outras classes que representam pessoas, como funcionários e clientes.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public abstract class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String telefone;
    private String email;

    /**
     * Construtor da classe Pessoa.
     * 
     * @param id Identificador único da pessoa.
     * @param nome Nome da pessoa.
     * @param idade Idade da pessoa.
     * @param telefone Telefone de contato da pessoa.
     * @param email Email da pessoa.
     * @throws IllegalArgumentException Se nome, telefone ou email forem nulos ou vazios, ou se a idade for negativa.
     */
    public Pessoa(int id, String nome, int idade, String telefone, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo ou vazio.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.email = email;
    }

    /**
     * Obtém o identificador único da pessoa.
     * 
     * @return O id da pessoa.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único da pessoa.
     * 
     * @param id O id a ser definido.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O nome a ser definido.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a idade da pessoa.
     * 
     * @return A idade da pessoa.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade da pessoa.
     * 
     * @param idade A idade a ser definida.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtém o telefone de contato da pessoa.
     * 
     * @return O telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone de contato da pessoa.
     * 
     * @param telefone O telefone a ser definido.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Obtém o email da pessoa.
     * 
     * @return O email da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email da pessoa.
     * 
     * @param email O email a ser definido.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna uma representação em String dos dados desta pessoa.
     * 
     * @return Uma string com o id, nome, idade, telefone e email da pessoa.
     */
    @Override
    public String toString() {
        return "id: " + id + "\n" +
               "nome='" + nome + "\n" +
               "idade=" + idade + "\n" +
               "telefone='" + telefone + "\n" +
               "email='" + email;
    }
}
