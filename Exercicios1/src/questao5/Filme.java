package questao5;

public class Filme {
    private String tituloOriginal, tituloPortugues, filmeGenero, paisOrigem, atoresNomes, diretorNome, tipoExibicao;
    private double filmeDuracao;
    private short faixaEtaria;

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloPortugues() {
        return tituloPortugues;
    }

    public void setTituloPortugues(String tituloPortugues) {
        this.tituloPortugues = tituloPortugues;
    }

    public String getFilmeGenero() {
        return filmeGenero;
    }

    public void setFilmeGenero(String filmeGenero) {
        this.filmeGenero = filmeGenero;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getAtoresNomes() {
        return atoresNomes;
    }

    public void setAtoresNomes(String atoresNomes) {
        this.atoresNomes = atoresNomes;
    }

    public String getDiretorNome() {
        return diretorNome;
    }

    public void setDiretorNome(String diretorNome) {
        this.diretorNome = diretorNome;
    }

    public String getTipoExibicao() {
        return tipoExibicao;
    }

    public void setTipoExibicao(String tipoExibicao) {
        this.tipoExibicao = tipoExibicao;
    }

    public double getFilmeDuracao() {
        return filmeDuracao;
    }

    public void setFilmeDuracao(double filmeDuracao) {
        this.filmeDuracao = filmeDuracao;
    }

    public short getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(short faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public Filme(String tituloOriginal, String tituloPortugues, String filmeGenero, String paisOrigem, String atoresNomes, String diretorNome, String tipoExibicao, double filmeDuracao, short faixaEtaria) {
        this.tituloOriginal = tituloOriginal;
        this.tituloPortugues = tituloPortugues;
        this.filmeGenero = filmeGenero;
        this.paisOrigem = paisOrigem;
        this.atoresNomes = atoresNomes;
        this.diretorNome = diretorNome;
        this.tipoExibicao = tipoExibicao;
        this.filmeDuracao = filmeDuracao;
        this.faixaEtaria = faixaEtaria;
    }
    
}
