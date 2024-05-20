package set.operacoesBasicas;

public class TestarMain {
    public static void main(String[] args) {
      /**
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        System.out.println("Existem " + convidados.contarConvidados() + " Convidados(a) dentro do Set de convidados");

        convidados.adicionarConvidado("covidado1", 1313);
        convidados.adicionarConvidado("covidado2", 4546);
        convidados.adicionarConvidado("covidado3", 1645);
        convidados.adicionarConvidado("covidado3", 1645);


        System.out.println("Existem " + convidados.contarConvidados() + " Convidados(a) dentro do Set de convidados");
        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigoConvite(1313);
        System.out.println("Existem " + convidados.contarConvidados() + " Convidados(a) dentro do Set de convidados");
       convidados.exibirConvidados();
       **/


       ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

       // Adicionando linguagens únicas ao conjunto
       conjuntoPalavrasUnicas.adicionarPalavra("Java");
       conjuntoPalavrasUnicas.adicionarPalavra("Python");
       conjuntoPalavrasUnicas.adicionarPalavra("JavaScript");
       conjuntoPalavrasUnicas.adicionarPalavra("Python");
       conjuntoPalavrasUnicas.adicionarPalavra("C++");
       conjuntoPalavrasUnicas.adicionarPalavra("Ruby");
       // Exibindo as linguagens únicas no conjunto
       conjuntoPalavrasUnicas.exibirPalavrasUnicas();

       // Removendo uma linguagem do conjunto
       conjuntoPalavrasUnicas.removerPalavra("Python");
       conjuntoPalavrasUnicas.exibirPalavrasUnicas();

       // Removendo uma linguagem inexistente
       conjuntoPalavrasUnicas.removerPalavra("Swift");

       // Verificando se uma linguagem está no conjunto
       System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Java"));
       System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Python"));

       // Exibindo as linguagens únicas atualizadas no conjunto
       conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}
