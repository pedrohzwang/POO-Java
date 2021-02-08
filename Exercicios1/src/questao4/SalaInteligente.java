package questao4;

public class SalaInteligente extends SalaAula{

    private boolean computadorRede;
    private boolean sistemaAudio;
    private boolean projetorAcoplado;
    private boolean computadorAluno;

    public SalaInteligente(int capacidade, String id, String apelido, String titulo, int quantidadeAssentos,
                           int quantidadeQuadros, int quantidadeMesaProfessor, boolean retroprojetor,
                           boolean telaProjecao, boolean tvCabo, boolean computadorRede, boolean sistemaAudio,
                           boolean projetorAcoplado, boolean computadorAluno) {
        super(capacidade, id, apelido, titulo, quantidadeAssentos, quantidadeQuadros, quantidadeMesaProfessor,
                retroprojetor, telaProjecao, tvCabo);
        this.computadorRede = computadorRede;
        this.sistemaAudio = sistemaAudio;
        this.projetorAcoplado = projetorAcoplado;
        this.computadorAluno = computadorAluno;
    }

    public boolean isComputadorRede() {
        return computadorRede;
    }

    public void setComputadorRede(boolean computadorRede) {
        this.computadorRede = computadorRede;
    }

    public boolean isSistemaAudio() {
        return sistemaAudio;
    }

    public void setSistemaAudio(boolean sistemaAudio) {
        this.sistemaAudio = sistemaAudio;
    }

    public boolean isProjetorAcoplado() {
        return projetorAcoplado;
    }

    public void setProjetorAcoplado(boolean projetorAcoplado) {
        this.projetorAcoplado = projetorAcoplado;
    }

    public boolean isComputadorAluno() {
        return computadorAluno;
    }

    public void setComputadorAluno(boolean computadorAluno) {
        this.computadorAluno = computadorAluno;
    }
}
