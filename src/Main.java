import list.ordenacao.OrdenacaoPessoas;
import list.pesquisa.CatalogoLivros;
import list.pesquisa.Livros;

import java.util.List;


public class Main {
    public static void main(String[] args) {
     /*   ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.adicionarTarefa("TAREFA 1");
        listaTarefas.adicionarTarefa("TAREFA 1");
        listaTarefas.adicionarTarefa("TAREFA 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.removerTarefa("TAREFA 1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
      */

        /*
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("feijão", 5.0, 1);
        carrinhoDeCompras.adicionarItem("arroz", 15.0, 5);
        System.out.println(carrinhoDeCompras.exibirItens());
        carrinhoDeCompras.removerItem("feijão");

        System.out.println("Valor total do carrinho de compras: R$ " + carrinhoDeCompras.calcularValorTotal(carrinhoDeCompras.exibirItens()));
        */

      /*  CatalogoLivros livros = new CatalogoLivros();
        livros.adicionarLivro("Crepúsculo", "Stephenie Meyer", 2005);
        livros.adicionarLivro("Lua Nova", "Stephenie Meyer", 2006);
        livros.adicionarLivro("Eclipse", "Stephenie Meyer", 2007);
        livros.adicionarLivro("Amanhecer", "Stephenie Meyer", 2008);
        livros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        livros.adicionarLivro("Harry Potter e a Câmara Secreta", "J.K. Rowling", 1998);
        livros.adicionarLivro("Harry Potter e o Prisioneiro de Azkaban", "J.K. Rowling", 1999);
        livros.adicionarLivro("Harry Potter e o Cálice de Fogo", "J.K. Rowling", 2000);

        System.out.println(livros.pesquisarPorAutor("Stephenie Meyer"));
        System.out.println(livros.pesquisarPorIntervaloAnos(1999,2000));
        System.out.println(livros.pesquisarPorTitulo("Harry Potter e a Pedra Filosofal")); */

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("larissa",28,1.55);
        ordenacaoPessoas.adicionarPessoa("Sarina",32,1.70);
        ordenacaoPessoas.adicionarPessoa("Ingrid",20,1.56);

//        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}