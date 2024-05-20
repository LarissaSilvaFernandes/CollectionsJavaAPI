package set.pesquisar;

public class TestarMain {
    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("joão", 1234666);
        agendaContatos.adicionarContato("maria", 123756);
        agendaContatos.adicionarContato("carlos", 12345);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("maria"));
        agendaContatos.atualizarNumeroContato("joão",13131);
        agendaContatos.exibirContatos();


    }
}
