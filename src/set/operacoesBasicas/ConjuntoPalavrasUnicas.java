package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoDePalavrasUnicasSet;


    public ConjuntoPalavrasUnicas() {
        this.conjuntoDePalavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoDePalavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!conjuntoDePalavrasUnicasSet.isEmpty()) {
            if (conjuntoDePalavrasUnicasSet.contains(palavra)) {
                conjuntoDePalavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Boolean verificarPalavra(String palavra) {
        return conjuntoDePalavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!conjuntoDePalavrasUnicasSet.isEmpty()) {
            System.out.println(conjuntoDePalavrasUnicasSet);
        }
    }

}
