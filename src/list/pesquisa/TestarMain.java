package list.pesquisa;

public class TestarMain {
    public static void main(String[] args) {
         CatalogoLivros livros = new CatalogoLivros();
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
        System.out.println(livros.pesquisarPorTitulo("Harry Potter e a Pedra Filosofal"));
    }
}
