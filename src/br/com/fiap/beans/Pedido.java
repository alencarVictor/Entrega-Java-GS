package br.com.fiap.beans;

public class Pedido {

    //Atributos
    private int numeroPedido;
    private Material material;
    private int quantidade;
    private double valorTotal;

    //Construtor Vazio
    public Pedido() {
    }

    //Construtor Cheio
    public Pedido(int numeroPedido, Material material, int quantidade, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.material = material;
        this.quantidade = quantidade;
        this.valorTotal = valorTotal;
    }

    //Getters e Setters
    public int getNumeroPedido() {return numeroPedido;}
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Material getMaterial() {return material;}
    public void setMaterial(Material material) {this.material = material;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    //ToString
    public String toString() {
        return "Pedido{" +
                "\n  numeroPedido=" + numeroPedido +
                "\n  material=" + material.getNome() +
                "\n  quantidade=" + quantidade + "kg" +
                "\n  valorTotal=R$ " + String.format("%.2f", valorTotal) +
                "\n}";
    }

    //Metodos da Classe

    // Método1
    public double aplicarDesconto() {
        if (quantidade >= 40) {
            return valorTotal * 0.90; // 10% de desconto
        }
        return valorTotal;
    }


    // Método2
    public int calcularPrazoEntrega() {
        if (quantidade >= 40) {
            return 5; // 5 dias úteis
        }
        return 2; // 2 dias úteis
    }

    // Método3
    public String gerarResumo() {
        double valorComDesconto = aplicarDesconto();
        String desconto = "";

        if (valorComDesconto < valorTotal) {
            desconto = "\nDesconto aplicado: 10%" +
                    "\nValor com desconto: R$ " + String.format("%.2f", valorComDesconto);
        }

        return "Pedido #" + numeroPedido +
                "\nMaterial: " + material.getNome() +
                "\nQuantidade: " + quantidade + "Kg" +
                "\nPreço por Kg: R$ " + String.format("%.2f", material.getPrecoKg()) +
                "\nValor Total: R$ " + String.format("%.2f", valorTotal) +
                desconto +
                "\nPrazo de Entrega: " + calcularPrazoEntrega() + " dias uteis";
    }
}
