package exemplo_construtores;

public class SistemaCadastro {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("123","nome");

        pessoa.setEndereco("Rua xyz");

        System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
    }
}
