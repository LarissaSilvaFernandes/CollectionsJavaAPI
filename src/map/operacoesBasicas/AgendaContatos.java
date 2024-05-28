package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos() {
        if (!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer contatosPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            contatosPorNome = agendaContatoMap.get(nome);
        }
        if (contatosPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return contatosPorNome;
    }
}
