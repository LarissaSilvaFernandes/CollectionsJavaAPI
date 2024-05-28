package map.operacoesBasicas;

public class TestarMain {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("nome1", 1313);
        agendaContatos.adicionarContato("nome2", 1404);
        agendaContatos.adicionarContato("nome3", 8080);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("nome3");
        agendaContatos.exibirContatos();

        System.out.println("O número é: "+ agendaContatos.pesquisarPorNome("nome2"));
    }
}
