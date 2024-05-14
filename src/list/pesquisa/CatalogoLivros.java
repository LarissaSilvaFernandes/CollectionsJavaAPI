package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livros> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livros(titulo, autor, anoPublicacao));

    }

    public List<Livros> pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livros l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosArrayList = new ArrayList<>();
        for (Livros livrosIntervaloAnos : livrosList) {
            if (livrosIntervaloAnos.getAnoDePublicacao() >= anoInicial && livrosIntervaloAnos.getAnoDePublicacao() <= anoFinal) {
                livrosArrayList.add(livrosIntervaloAnos);
            }
        }
        return livrosArrayList;
    }

    public Livros pesquisarPorTitulo(String titulo) {
        Livros livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livros l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
}
