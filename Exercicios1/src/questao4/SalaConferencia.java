package questao4;

public class SalaConferencia extends Sala{

    private boolean projetor;
    private int quantidadeMicrofone;

    public SalaConferencia(int capacidade, String id, String apelido,
                           String titulo, boolean projetor, int quantidadeMicrofone) {
        super(capacidade, id, apelido, titulo);
        this.projetor = projetor;
        this.quantidadeMicrofone = quantidadeMicrofone;
    }

    public boolean isProjetor() {
        return projetor;
    }

    public void setProjetor(boolean projetor) {
        this.projetor = projetor;
    }

    public int getQuantidadeMicrofone() {
        return quantidadeMicrofone;
    }

    public void setQuantidadeMicrofone(int quantidadeMicrofone) {
        this.quantidadeMicrofone = quantidadeMicrofone;
    }
}
