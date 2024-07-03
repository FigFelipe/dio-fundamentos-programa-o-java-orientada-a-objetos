package exemplo_get_set.escola;

public class Aluno {

    // Classe de modelo que representa um objeto ALUNO
    // Adicionando GET e SET conforme padrão JAVA Beans

    private String nome;
    private int idade;

    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
