package br.com.fiap.main;


import br.com.fiap.beans.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //INSTANCIA DE TODOS OS OBJETOS
        Material material = new Material("Material demonstrativo", 250.00, true);
        Aluminio aluminio = new Aluminio(99.9);
        Titanio titanio = new Titanio("Órbita abandonada");
        Ouro ouro = new Ouro(18);
        Plastico plastico = new Plastico("PET");
        Metal metal = new Metal("Ferrosa");
        Pedido pedido = new Pedido(01, material, 20, 5000.00);
        Missao missao = new Missao("Órbita Baixa", "Drone-X1", "Confirmada");


        // Demonstração do método de Material (calcularValorLote())
        System.out.println("\n=== MÉTODOS DE MATERIAL ===");
        System.out.println("Valor do lote de Alumínio (20kg): R$ " + String.format("%.2f", aluminio.calcularValorLote(20)));
        System.out.println("Valor do lote de Titânio (40kg): R$ " + String.format("%.2f", titanio.calcularValorLote(40)));
        System.out.println("Valor do lote de Ouro (50kg): R$ " + String.format("%.2f", ouro.calcularValorLote(50)));
        System.out.println("Valor do lote de Plástico (20kg): R$ " + String.format("%.2f", plastico.calcularValorLote(20)));
        System.out.println("Valor do lote de Metal (40kg): R$ " + String.format("%.2f", metal.calcularValorLote(40)));

        // Demonstração dos métodos de Pedido aplicarDesconto(), calcularPrazoEntrega() , gerarResumo()
        System.out.println("\n=== MÉTODOS DE PEDIDO ===");
        System.out.println("Valor com desconto: R$ " + String.format("%.2f", pedido.aplicarDesconto()));
        System.out.println("Prazo de entrega: " + pedido.calcularPrazoEntrega() + " dias úteis");
        System.out.println("\n" + pedido.gerarResumo());

        // Demonstração do método de Missão confirmarMissao())
        System.out.println("\n=== MÉTODO DE MISSÃO ===");
        System.out.println(missao.confirmarMissao());

        // ─── MENU PRINCIPAL ────────────────────────────────────────────────────────

        int numeroPedido = 2;
        String opcaoInicial = "";
        while (!opcaoInicial.equals("0")) {

            opcaoInicial = JOptionPane.showInputDialog(
                    "=== PLATAFORMA B2B - MATERIAIS ESPACIAIS ===\n\n" +
                            "1 - Ver Catálogo\n" +
                            "2 - Realizar Compra\n" +
                            "3 - Solicitar Limpeza Espacial\n" +
                            "0 - Sair");

            if (opcaoInicial == null) break;

            switch (opcaoInicial) {
                case "1":
                    JOptionPane.showMessageDialog(null,
                            "=== CATÁLOGO DE MATERIAIS ===\n\n" +
                                    "1 - Alumínio\n" +
                                    "   Preço: R$ 12,00/kg\n" +
                                    "   Reciclável: Sim\n\n" +
                                    "2 - Titânio\n" +
                                    "   Preço: R$ 85,00/kg\n" +
                                    "   Reciclável: Sim\n\n" +
                                    "3 - Ouro\n" +
                                    "   Preço: R$ 950,00/kg\n" +
                                    "   Reciclável: Não\n\n" +
                                    "4 - Plástico\n" +
                                    "   Preço: R$ 4,50/kg\n" +
                                    "   Reciclável: Sim\n\n" +
                                    "5 - Metal\n" +
                                    "   Preço: R$ 18,00/kg\n" +
                                    "   Reciclável: Sim");
                    break;

                case "2":
                    // Menu de Material
                    Material materialEscolhido = null;
                    while (materialEscolhido == null) {
                        try {
                            String menuMaterial = "=== COMPRA DE MATERIAIS ===\n\n" +
                                    "Escolha o material:\n\n" +
                                    "1 - Alumínio\n" +
                                    "2 - Titânio\n" +
                                    "3 - Ouro\n" +
                                    "4 - Plástico\n" +
                                    "5 - Metal";

                            String opcaoMaterial = JOptionPane.showInputDialog(menuMaterial);

                            if (opcaoMaterial == null) break;

                            switch (opcaoMaterial) {
                                case "1": materialEscolhido = aluminio; break;
                                case "2": materialEscolhido = titanio;  break;
                                case "3": materialEscolhido = ouro;     break;
                                case "4": materialEscolhido = plastico; break;
                                case "5": materialEscolhido = metal;    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 1 e 5.");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro na seleção do material!");
                        }
                    }

                    if (materialEscolhido == null) break;

                    // Menu de Quantidade
                    int quantidadeEscolhida = 0;
                    while (quantidadeEscolhida == 0) {
                        try {
                            String menuQuantidade = "Escolha a quantidade de " + materialEscolhido.getNome() + ":\n\n" +
                                    "1 - 10 kg\n" +
                                    "2 - 20 kg\n" +
                                    "3 - 40 kg\n" +
                                    "4 - 50 kg\n" +
                                    "5 - 100 kg";

                            String opcaoQuantidade = JOptionPane.showInputDialog(menuQuantidade);

                            if (opcaoQuantidade == null) break;

                            switch (opcaoQuantidade) {
                                case "1": quantidadeEscolhida = 10;  break;
                                case "2": quantidadeEscolhida = 20;  break;
                                case "3": quantidadeEscolhida = 40;  break;
                                case "4": quantidadeEscolhida = 50;  break;
                                case "5": quantidadeEscolhida = 100; break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 1 e 5.");
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro na seleção da quantidade!");
                        }
                    }

                    if (quantidadeEscolhida == 0) break;

                    // Gera o Pedido com número incremental
                    Pedido pedidoRealizado = new Pedido(numeroPedido, materialEscolhido, quantidadeEscolhida, materialEscolhido.calcularValorLote(quantidadeEscolhida));
                    numeroPedido++;

                    // Exibe o Resumo
                    JOptionPane.showMessageDialog(null, pedidoRealizado.gerarResumo());

                    // NOTA FISCAL no Terminal
                    System.out.println("\n=== NOTA FISCAL ===");
                    System.out.println(pedidoRealizado.gerarResumo());
                    System.out.println("=====================");

                    // ESTADO DO OBJETO
                    System.out.println("\n=== ESTADO DO OBJETO ===");
                    System.out.println(pedidoRealizado.toString());
                    System.out.println("===========================");

                    break;
                case "3":
                    // Pergunta a órbita
                    String orbitaEscolhida = null;
                    while (orbitaEscolhida == null || orbitaEscolhida.trim().isEmpty()) {
                        orbitaEscolhida = JOptionPane.showInputDialog("Qual órbita deseja limpar?\n\nEx: Órbita Baixa, Órbita Média, Órbita Alta");
                        if (orbitaEscolhida == null) break;
                        if (orbitaEscolhida.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Por favor, informe a órbita!");
                        }
                    }
                    if (orbitaEscolhida == null) break;

                    // Pergunta o drone
                    String droneEscolhido = null;
                    while (droneEscolhido == null || droneEscolhido.trim().isEmpty()) {
                        droneEscolhido = JOptionPane.showInputDialog("Qual drone fará o serviço?\n\nEx: Drone-X1, Drone-X2, Drone-X3");
                        if (droneEscolhido == null) break;
                        if (droneEscolhido.trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Por favor, informe o drone!");
                        }
                    }

                    if (droneEscolhido == null) break;

                    // Cria e confirma a missão
                    Missao missaoRealizada = new Missao(orbitaEscolhida, droneEscolhido, "Confirmada");
                    JOptionPane.showMessageDialog(null, missaoRealizada.confirmarMissao());

                    // Imprime no terminal
                    System.out.println("\n=== MISSÃO SOLICITADA ===");
                    System.out.println(missaoRealizada.confirmarMissao());
                    System.out.println("============================");

                    // ESTADO DO OBJETO
                    System.out.println("\n=== ESTADO DO OBJETO ===");
                    System.out.println(missaoRealizada.toString());
                    System.out.println("========================");
                    break;
                case "0":
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha entre 0 e 3.");
            }
        }
        JOptionPane.showMessageDialog(null, "Sistema encerrado. Até logo!");
    }
}