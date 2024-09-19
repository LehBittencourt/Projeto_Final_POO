package com.mycompany.loja_fisica_esportiva;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * A classe Loja_fisica_esportiva contém o principal para o sistema de gerenciamento 
 * da loja esportiva.
 * 
 * @author [Leandro, Leticia, Luana, Ana Clara]
 */
public class Loja_fisica_esportiva {

    /**
     * Método principal que executa o programa.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto(1, "Whey", "Namore com o suco", "Suplemento", 183.57);
        Produto produto2 = new Produto(2, "Bola de Futebol", "Bola de futebol profissional", "Esportes", 523.47);

        ItemEstoque itemEstoque1 = new ItemEstoque(produto1, 50);
        ItemEstoque itemEstoque2 = new ItemEstoque(produto2, 30);

        ArrayList<ItemEstoque> itensEstoque = new ArrayList<>();
        itensEstoque.add(itemEstoque1);
        itensEstoque.add(itemEstoque2);
        Estoque estoque = new Estoque(itensEstoque);

        Cliente cliente = new Cliente(1, "lulu", 23, "11111111111", "lulu@email.com", "pintopoles", 37);

        Vendedor vendedor = new Vendedor(1, "Ana Costa", 30, "99999999999", "anaaa@email.com", "Manhã", 1430.0, "pindamonhangaba", 10.0);

        Administrador administrador = new Administrador(1, "Leandro", 89, "55555555555", "leo@email.com", "Tarde", 42.0, "senhaAdmin", "Gerente");

        ArrayList<ItemPedido> itensPedido = new ArrayList<>();
        itensPedido.add(new ItemPedido(produto1, 2));
        itensPedido.add(new ItemPedido(produto2, 1));
        Pedido pedido = new Pedido(cliente, vendedor, "2024-09-10", itensPedido);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cliente");
            System.out.println("2 - Vendedor");
            System.out.println("3 - Administrador");
            System.out.println("0 - Sair");
            System.out.print("Digite sua escolha: ");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    // Menu para o cliente
                    while (true) {
                        System.out.println("\nEscolha uma opção:");
                        System.out.println("1 - Selecionar produto");
                        System.out.println("2 - Adicionar item ao pedido");
                        System.out.println("3 - Solicitar troca");
                        System.out.println("4 - Solicitar devolução");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.print("Digite sua escolha: ");
                        int esc_cliente = scanner.nextInt();
                        scanner.nextLine();
                        if (esc_cliente == 0) {
                            break;
                        }
                        switch (esc_cliente) {
                            case 1:
                                cliente.selecionarProduto();
                                break;
                            case 2:
                                cliente.adicionarItemPedido();
                                break;
                            case 3:
                                cliente.solicitarTroca(pedido);
                                break;
                            case 4:
                                cliente.solicitarDevolucao(pedido);
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 2:
                    // Menu para o vendedor
                    while (true) {
                        System.out.println("\nEscolha uma opção:");
                        System.out.println("1 - Cadastrar cliente");
                        System.out.println("2 - Verificar cliente");
                        System.out.println("3 - Excluir cliente");
                        System.out.println("4 - Atualizar dados");
                        System.out.println("5 - Aplicar desconto");
                        System.out.println("6 - Calcular preço total");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.print("Digite sua escolha: ");
                        int esc_vendedor = scanner.nextInt();
                        scanner.nextLine();
                        if (esc_vendedor == 0) {
                            break;
                        }
                        switch (esc_vendedor) {
                            case 1:
                                vendedor.cadastrarCliente(cliente);
                                break;
                            case 2:
                                vendedor.verificarCliente(cliente);
                                System.out.println(cliente.toString());
                                break;
                            case 3:
                                vendedor.excluirCliente(cliente);
                                break;
                            case 4:
                                vendedor.atualizarCliente(cliente);
                                break;
                            case 5:
                                vendedor.aplicarDesconto(pedido);
                                break;
                            case 6:
                                
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 3:
                    // Menu para o administrador
                    while (true) {
                        System.out.println("\nEscolha uma opção:");
                        System.out.println("1 - Inserir item no estoque");
                        System.out.println("2 - Atualizar item no estoque");
                        System.out.println("3 - Remover item do estoque");
                        System.out.println("4 - Visualizar item do estoque");
                        System.out.println("5 - Contratar vendedor");
                        System.out.println("6 - Consultar vendedor");
                        System.out.println("7 - Atualizar dados do vendedor");
                        System.out.println("8 - Demitir vendedor");
                        System.out.println("0 - Voltar ao menu principal");
                        System.out.print("Digite sua escolha: ");
                        int esc_adm = scanner.nextInt();
                        scanner.nextLine();
                        if (esc_adm == 0) {
                            break;
                        }
                        switch (esc_adm) {
                            case 1:
                                administrador.inserirItemEstoque(itemEstoque2);
                                break;
                            case 2:
                                administrador.atualizarItemEstoque(itemEstoque2);
                                break;
                            case 3:
                                administrador.removerItemEstoque(itemEstoque2);
                                break;
                            case 4:
                                administrador.consultarItemEstoque(itemEstoque2);
                                System.out.println(itensEstoque.toString());
                                break;
                            case 5:
                                administrador.contratarVendedor(vendedor);
                                break;
                            case 6:
                                administrador.consultarVendedor(vendedor);
                                System.out.println(vendedor.toString());
                                break;
                            case 7:
                                administrador.atualizarVendedor(vendedor);
                                break;
                            case 8:
                                administrador.demitirVendedor(vendedor);
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
