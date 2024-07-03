package exemplo_construtores;

public class Pessoa {

    private String nome;
    private String cpf;
    private String endereco;

    // 1. Metodo construtor, possui o mesmo nome da classe
    // 2. Não deve ser repetitivo, usado somente para dados importantes
    // 3. Uma boa prática, é ter um construtor padrão (vazio)
    //    complementada de um construtor com os parametros necessarios para a aplicação

    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
