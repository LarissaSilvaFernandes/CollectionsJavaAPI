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

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livros> livrosArrayList = new ArrayList<>();
        for (Livros livrosIntervaloAnos : livrosList) {
            if (livrosIntervaloAnos.getAnoDePublicacao() >= anoInicial && livrosIntervaloAnos.getAnoDePublicacao() <= anoFinal) {
                livrosArrayList.add(livrosIntervaloAnos);
            }
        }
        return livrosArrayList;
    }

    public void pesquisarPorAutor(String autor) {
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livrosPorAutor.isEmpty()) {
            for (Livros l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosList.add(l);
                }
            }
        }
        
    }
}

