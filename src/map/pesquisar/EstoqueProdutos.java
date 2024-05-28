package map.pesquisar;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutoMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        if (!estoqueProdutoMap.isEmpty()) {
            System.out.println(estoqueProdutoMap);
        } else {
            System.out.println("Estoque vazio!");
        }
    }

    public double calcularValorTotalEstoque() {
        double produtoValorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                produtoValorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return produtoValorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorProduto = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorProduto) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
}
