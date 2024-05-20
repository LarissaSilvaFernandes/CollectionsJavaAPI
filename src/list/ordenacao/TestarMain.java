package list.ordenacao;

public class TestarMain {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("larissa", 28, 1.55);
        ordenacaoPessoas.adicionarPessoa("Sarina", 32, 1.70);
        ordenacaoPessoas.adicionarPessoa("Ingrid", 20, 1.56);

//        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
    }
}
