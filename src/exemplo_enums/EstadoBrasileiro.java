package exemplo_enums;

public enum EstadoBrasileiro {

    // Objetos pré-estabelecidos de valor imutável
    SAO_PAULO ("SP","São Paulo", 11),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 21),
    PIAUI ("PI", "Piauí", 89),
    MARANHAO ("MA","Maranhão", 98),
    CEARA("CE", "Ceará", 85)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    // Construtor
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
