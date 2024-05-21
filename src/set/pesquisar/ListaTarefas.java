package set.pesquisar;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> listaTarefasSet;

    public ListaTarefas() {
        this.listaTarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {

        listaTarefasSet.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));
    }

    public void exibirTarefas() {
        System.out.println(listaTarefasSet);
    }

    public int contarTarefas() {
        return listaTarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (!t.isConcluida()) {
                tarefaConcluidas.add(t);
            }
        }
        return tarefaConcluidas;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaTarefaPendente = null;
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaTarefaPendente = t;
                break;
            }
        }
        if (tarefaTarefaPendente != null) {
            if (tarefaTarefaPendente.isConcluida()) {
                tarefaTarefaPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        listaTarefasSet.clear();
    }
}