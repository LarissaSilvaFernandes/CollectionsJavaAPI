package list.operacoesBasicas;

public class TestarMain {
    public static void main(String[] args) {
       /**
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("TAREFA 1");
        listaTarefas.adicionarTarefa("TAREFA 1");
        listaTarefas.adicionarTarefa("TAREFA 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.removerTarefa("TAREFA 1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
        **/



        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("feijão", 5.0, 1);
        carrinhoDeCompras.adicionarItem("arroz", 15.0, 5);
        System.out.println(carrinhoDeCompras.exibirItens());
        carrinhoDeCompras.removerItem("feijão");

        System.out.println("Valor total do carrinho de compras: R$ " + carrinhoDeCompras.calcularValorTotal(carrinhoDeCompras.exibirItens()));

    }
}
