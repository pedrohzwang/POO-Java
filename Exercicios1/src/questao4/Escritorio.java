package questao4;

public class Escritorio extends Sala{

    private int quantidadeEscrivaninhas;
    private boolean impressora;

    public Escritorio(int capacidade, String id, String apelido, String titulo,
                      int quantidadeEscrivaninhas, boolean impressora) {
        super(capacidade, id, apelido, titulo);
        this.quantidadeEscrivaninhas = quantidadeEscrivaninhas;
        this.impressora = impressora;
    }

    public int getQuantidadeEscrivaninhas() {
        return quantidadeEscrivaninhas;
    }

    public void setQuantidadeEscrivaninhas(int quantidadeEscrivaninhas) {
        this.quantidadeEscrivaninhas = quantidadeEscrivaninhas;
    }

    public boolean isImpressora() {
        return impressora;
    }

    public void setImpressora(boolean impressora) {
        this.impressora = impressora;
    }
}
