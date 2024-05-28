package map.pesquisar;

public class TestarMain {
    public static void main(String[] args) {
        EstoqueProdutos produtos = new EstoqueProdutos();
        produtos.adicionarProduto(123, "tv", 5, 4.0);
        produtos.adicionarProduto(456, "celular", 2, 10.0);
        produtos.adicionarProduto(123, "pc", 1, 100.0);

        produtos.exibirProdutos();
        System.out.println("Valor total do estoque: "+produtos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+produtos.obterProdutoMaisCaro());
    }
}
