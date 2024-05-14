package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeComprasList;


    public void adicionarItem(String nome, double preco, int quantidade) {
        if (carrinhoDeComprasList == null) {
            carrinhoDeComprasList = new ArrayList<>();
        }
        carrinhoDeComprasList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinhoDeComprasList.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public double calcularValorTotal(List<Item> itemList) {
        double valorTotal = 0.0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public List<Item> exibirItens() {
        return carrinhoDeComprasList;
    }
}
