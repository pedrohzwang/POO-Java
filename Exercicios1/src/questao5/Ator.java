package questao5;

public class Ator {

    private short numeroIdentificacaoAtor;
    private String nomeAtor, nacionalidadeAtor, idadeAtor;
    private double cacheAtuacao;

    public short getNumeroIdentificacaoAtor() {
        return numeroIdentificacaoAtor;
    }

    public void setNumeroIdentificacaoAtor(short numeroIdentificacaoAtor) {
        this.numeroIdentificacaoAtor = numeroIdentificacaoAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNacionalidadeAtor() {
        return nacionalidadeAtor;
    }

    public void setNacionalidadeAtor(String nacionalidadeAtor) {
        this.nacionalidadeAtor = nacionalidadeAtor;
    }

    public String getIdadeAtor() {
        return idadeAtor;
    }

    public void setIdadeAtor(String idadeAtor) {
        this.idadeAtor = idadeAtor;
    }

    public double getCacheAtuacao() {
        return cacheAtuacao;
    }

    public void setCacheAtuacao(double cacheAtuacao) {
        this.cacheAtuacao = cacheAtuacao;
    }

    public Ator(short numeroIdentificacaoAtor, String nomeAtor, String nacionalidadeAtor, String idadeAtor, double cacheAtuacao) {
        this.numeroIdentificacaoAtor = numeroIdentificacaoAtor;
        this.nomeAtor = nomeAtor;
        this.nacionalidadeAtor = nacionalidadeAtor;
        this.idadeAtor = idadeAtor;
        this.cacheAtuacao = cacheAtuacao;
    }
    
}
